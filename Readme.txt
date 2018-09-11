declare
outofbalance exception;
a bankmaster.accno%type;
b bankmaster.uname%type;
c bankmaster.acctype%type;
d bankmaster.balance%type;
t bankmaster.balance%type;
begin
a:='&accno';
d:='&balance';
select balance into t from bankmaster where accno=a;
if t-d>=500 then
update bankmaster set balance=t-d where accno=a;
dbms_output.put_line('credited successfully');
else
raise outofbalance;
end if;
exception
when NO_DATA_FOUND then
dbms_output.put_line('record not found');
when outofbalance then
dbms_output.put_line('No balance');
end;
/
