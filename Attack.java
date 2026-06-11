public class Attack {
    
        private int damage;
        private int lifeChange;
        private int numHits;
        private boolean isRanged;
        private String name;
        
        public Attack(int dmg, int change, int hits, boolean range, String n)
        {
            damage = dmg;
            lifeChange = change;
            numHits = hits;
            isRanged = range;
            name = n;
        }
        
        // returns the damage done by each hit
        public int getDamage()
        {
            return damage;
        }
        
        // returns change in the users life total from the attack
        public int getLifeChange()
        {
            return lifeChange;
        }
        
        // returns the number of hits from the attack
        public int getNumHits()
        {
            return numHits;
        }
        
        // returns weather or not the attack is ranged
        public boolean getRange()
        {
            return isRanged;
        }
        
        // returns the name of the attack
        public String getAtName()
        {
            return name;
        }
        
    
}
