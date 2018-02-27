pg 1

mkdir -p 2bcac
mkdir -p 3bcac
rm -rf 3bcac
echo " display the file cintents in file1"
echo "--------"
cat file1
echo " copy the contents from file1 to file2"
echo "----------"
cp file1 file2
ls
echo "file2 contents"
echo "-----------"
cat file2
echo " compare the two files"
echo "-----------"
cmp file1 file3
echo "split the content of the file"
echo "---------"
split -l  1 file1 
ls
echo " differ the content of the file "
echo "--------" 
diff  file1 file3
echo " display the no of lines, character and words "
wc -l file1
wc -w file1
wc -c file1


pg 2

echo  "current login user” $(whoami)
echo "---------"
echo  "to print the current shell " $(uname)
echo "--------"
echo  " to print the homedirectory:$HOME
echo "----------"
echo " to print the os type "$(uname)
echo "----------"
echo "current path setting"$(pwd)
echo "-----------"
echo " current login user and shells " who
echo "---------"
echo "cpu information "
cat/proc/cpuinfo>
echo " showing memeory information" $(free)
echo "-------"


pg 3

echo " list all the files and directories "
echo "--------"
ls
echo " list all the files and directories using output redirection"
echo "--------"
echo " ls > sample"
ls > sample
cat sample
echo " list the no of lines in a file using input redirection"
echo "------------"
echo " wc -l < file1"
wc -l <file1
echo " list all the files and directories using output redirection >>append to existing  file"
echo "----------"
echo " ls>> file4"
ls >> file4
echo " cat file4"
cat file4
echo" error showing for rediectory STDERR"
echo "--------"
echo " ls -l video > error"
ls -l  video > error
echo " cat error "
cat error
echo " list the first three lines in home directory using pipe command"
echo "----------"
echo " ls | head -3"
ls | head -3
echo " list the last t9999hree file in home directory using pipe command"
echo "--------"
echo " ls | tail -3 "
ls | tail -3
echo " list the contents of file in both terminal and STDOUT using pipe ana tee command"
echo "---------"
echo " ls | tee file6"
ls | tee file6
echo " infile"
echo "------------"
cat file6
echo " write  to a file and append output using pipe and tee command"
echo "----------"
echo " echo '4bscs' | tee file3"
echo '4bcscs'  | tee file3
cat file3    


pg 4

echo "1- who am i?"
echo "2- who is logged on?"
echo "3- date"
echo "4- calendar"
echo "5- Current directory"
echo "6- file listing"
echo "enter your choice:"
read n
case $n in
1) whoami;;
2) who;;
3) date;;
4) cal;;
5) pwd;;
6) ls;;
esac


pg 6

Clear 
echo ”enter the filename”
read  fname
if [       -e $fname ]
then
echo $fname  " file exist"
if   [     –s $fname ]
then
echo $fname  “file name size  >0 ”
echo “file details are ”
ls -l  $fname
else 
rm $fname
echo  $fname  “  file id deleted which has size = 0”
fi
else
echo " file not exist"
fi


pg 7

echo "enter the number"
read n
sum=0
sd =1
a=1
b=10
while [ $num -gt 0 ]
do
sd=`expr $num % 10`
sum=`expr $sum + $sd`
n=`expr $num / 10`
done
if [ $sum -gt 9 ]
then
sd1=$((sum-b))
sum1=$((sum+a))
echo" the sum of digit  is : $sum"
else
echo "the sum of digit  is :”$sum
fi


pg 9

echo "Enter the string"
read s
echo $s > temp
rvs="$(rev temp)"
if [ $s = $rvs ]
then
echo "it is palindrome
else
echo " it is not a palindrome"
fi


pg 10

echo "Enter a Number"
read n
 echo "Enter the  Range"
read r  
 i=0
while [ $i -le $r ]                       
do
    echo " $n x $i = `expr $n \* $i`"
    i=`expr $i + 1`
done
