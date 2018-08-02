
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
http://demo.themewagon.com/preview/asentus-free-responsive-bootstrap-corporate-agency-html5-template






I just finished reading Stephen King's "On Writing."

It's a great little book where he shares some of the writing advice and stories he's picked up over the course of his career as a bestselling author.

He goes pretty deeply into the "behind the scenes" of his writing process, what his schedule looks like, etc.

All very interesting stuff. I'd highly recommend the book if you're interested in writing or just want to get a slightly different peek inside Stephen King's brain for a few hours.

Now, why am I telling you this? There's a chapter in the book where he says, in essence, that:

"All writing is re-writing."

That really struck a cord with me.

And I think it applies directly to what you and I do as Python programmers...

Here, let me explain:

One important thing you need to realize is that there's NEVER a "perfect" first draft:

Just like writing, programming is NOT a linear process. It's an iterative one.

You start with a "blank piece of paper"—whether that's a blank .py file or some boilerplate code you pulled from an existing template.

Then you get your first draft down...just get it out:

Maybe it doesn't fulfill all of the requirements yet (usually it doesn't, at least for me.)

Maybe the code you write looks a little "ugly": the formatting is off, the naming is bad, it's too complicated for what it does.

But that's okay.

Stephen King doesn't write a novel in a single pass—and neither do you need to write the perfect program in one go.

Because now you're going to iterate on what you've got so far:

You're going add a little more functionality. Make the code a little prettier. Tease out some functions here and there. Add docstrings and comments.

And you're going to keep iterating and making changes until your program is ready to face the day—

Basically, "all programming is re-programming."

Or as Kent Beck (the Test-Driven Development guru) put it:

"Make it run, make it right, make it fast."

This is really a mantra to live (to program) by.

If you look closely you'll find this idea in all kinds of other creative endeavours (except maybe not in sandcastle competitions.)

Happy Pythoning!

— Dan Bader
