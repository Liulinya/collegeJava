public interface LispList{
   LispList NIL = new EmptyList();
   boolean empty();
   Object head();
   LispList tail();
   LispList cons(Object obj);
}
