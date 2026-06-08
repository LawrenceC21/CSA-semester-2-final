public class Fighter {
        private String name;
        private int hp;
        private boolean isDefeated;
        private Attack at1;
        private Attack at2;
        
        public Fighter(String n, int health, Attack attackOne, Attack attackTwo)
        {
            name = n;
            hp = health;
            isDefeated = false;
            at1 = attackOne;
            at2 = attackTwo;
        }
        public String getFightName()
        {
            return name;
        }
        
        public int getHp()
        {
            return hp;
        }
        
        public void ChangeHp(int change)
        {
            hp += change;
            if(hp <= 0)
            {
                isDefeated = true;
            }
        }
        
        public boolean getSatis()
        {
            return isDefeated;
        }
        
        public Attack getAtOne()
        {
            return at1;
        }
        
        public Attack getAtTwo()
        {
            return at2;
        }
        
        public void heal()
        {
            int healthGain = (int)(Math.random() * 35) + 5;
            hp += healthGain;
        }
}
