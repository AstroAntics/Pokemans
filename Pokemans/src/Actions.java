public class Action
{
	
}

public class Plead extends Action
{
	/*
	This function controls the Pleading mechanic (i.e. begging an enemy Pokemon to spare yours.) Enemy Pokemon are more likely to spare your Pokemon if it's injured,
	but there are other factors that come into play:
	MercyCounter = the more times you plead, the more likely the Pokemon is to spare you.
	Aggression = how angry the Pokemon is. Higher aggression = longer cooldown.
	AttackPower = how strong the Pokemon is.
	TurnsSince = time since you tried to plead
	CriticalHP = an integer determined by your Pokemons HP. Enemies are far more likely to spare you if your Pokemon reaches this level or drops below it
	AttackQueue = attacks queued up if the plea is unsuccessful.
	EnemyReactions = a list of all the reactions an enemy can have.
	IsEnemyDead = will stop you from pleading to a dead enemy.
	IsPlayerDead = can't plead if you're dead.
	IsAttackQueuedUp = plea will be cancelled if an attack is queued up.
	PleaAccepted = will mercy be shown to you?
	*/
	int MercyCounter;
	int Aggression = 0;
	int AttackPower = 0;
	int TurnsSince;
	int CriticalHP;
	int HP;
	int AttackQueue = 0;
	String[] EnemyReactions;
	boolean IsEnemyDead;
	boolean IsPlayerDead;
	boolean IsAttackQueuedUp;
	boolean PleaAccepted;
	
	//initialize HP
	HP = Pokemon.hp;
	
	//First of all, you can't plead if you're dead.
	//Or if the enemy is dead and you aren't.
	if (IsPlayerDead || (!IsPlayerDead && IsEnemyDead))
	{
		return;
	}
	
	//Can't plead if an attack is queued up. (Check both boolean and int for this to prevent overlap.)
	if (IsAttackQueuedUp || AttackQueue > 0)
	{
		System.out.println("You try to plea, but it's obviously too busy charging up another attack.");
		System.out.println("Your words fall on deaf ears.");
		return;
	}
	
	//Determine critical hp threshold. (Just divide by 5 for now.) Casted to int for sanity purposes.
	CriticalHP = (int)(Pokemon.hp/5)
	
	//Set mercy counter and turns since to 0, since the encounter just started.
	MercyCounter = 0;
	TurnsSince = 0;
	
	//Enemies won't accept your plea first unless you hit your critical hp.
	if ((MercyCounter == 0) || (TurnsSince == 0) || (HP > CriticalHP))
	{
		System.out.println("You're not looking for a fight. You try to shout that you don't want a fight. But the words die in your throat.");
		return;
	}	
}

public class Fight extends Action
{
	
}

public class Flee extends Action
{
	
}

public class Heal extends Action
{
	
}
