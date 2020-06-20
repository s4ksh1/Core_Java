class Player
{ 
  int age;
  String name;
  String team_name;
  Player( String s ,String s1, int t)
  {
    age=t;
    team_name=s1;
    name=s;
  }
  void display()
  {
    System.out.println("Age="+age);
    System.out.println("Name="+name);
    System.out.println("Team name="+team_name);
  }
}
class Cricket_Player extends Player
{
  String game_type;
  Cricket_Player(String s,String s1,int t ,String t1 )
  {
    super(s,s1,t);
    game_type=t1;
  }
}
class Football_Player extends Player
{
  String game_type;
  Football_Player(String s,String s1,int t ,String t1 )
  {
    super(s,s1,t);
    game_type=t1;
  }
}
class Main
{
  public static void main(String[] args)
  {
    Cricket_Player c= new Cricket_Player("ram","C",23,"cricket");
    Football_Player f=new Football_Player("raj","F",24,"Football");
    c.display();
    f.display();
  }
}

Output:
Age=23
Name=ram
Team name=C
Age=24
Name=raj
Team name=F
