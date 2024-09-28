//(this) keyword is used to reduce confusion between same named variable
// this keyword refers to a current object

class teacher_name{
    String answer;          //below this.answer(e.i..t1.answer) is refers this answer
    void setname(String answer){
        this.answer=answer;
    }
    public static void main(String args[]){
        teacher_name t1= new teacher_name();
        t1.setname("abi");
        System.out.print(t1.answer);

    }
}