
  declare
  cursor std is select * from marks;
  i number;
  begin
  for i in std loop
  if(i.m1>=40 and i.m2>=40 and i.m3>=40)
  then
  i.result:='pass';
  else
  i.result:='fail';
  end if;
 update marks set total=i.m1+i.m2+i.m3,avg=(total/3) where rno=i.rno;
 if(i.avg>81) then
 i.grade:='1';
 end if;
 if(i.avg>60 and i.avg<80) then
 i.grade:='2';
 else
 i.grade:='3';
 end if;
  if(i.result='pass') then
  insert into pass values(i.rno,i.name,i.dept,i.m1,i.m2,i.m3,i.total,i.avg,i.grade,i.result);
  end if;
  if(i.result='fail') then
  insert into fail values(i.rno,i.name,i.dept,i.m1,i.m2,i.m3,i.total,i.avg,i.grade,i.result);
  end if;
  end loop;
end;
