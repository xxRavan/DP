class HomeTheaterRemote
 {
		static Light l = new Light();
		static Fan f = new Fan();
		static Projector p = new Projector();
		static Popcornpopper pp = new Popcornpopper();
		static Screen s = new Screen();
		static Amplifier amf = new Amplifier();
		static CDPlayer cp = new CDPlayer();
		static DVDPlayer dp = new DVDPlayer();

		private static HomeTheaterRemote htr;
		private HomeTheaterRemote(Light l,Fan f, Projector p, Popcornpopper pp, Screen s, Amplifier amf, CDPlayer cp, DVDPlayer dp)
	 	{
			this.l = l;
			this.f = f;
			this.p = p;
			this.pp = pp;
			this.s = s;
			this.amf = amf;
			this.cp = cp;
			this.dp = dp;
	
	 	}

		public void wathchmovie()
	 	{
			l.dim();
			pp.on();
			pp.popping();
			p.on();
			f.on();
			amf.setvolume(87);
			amf.settuner(3);
			cp.play();
			dp.play();
	 	}

		public void endmovie()
	 	{
			l.on();
			pp.off();
			p.off();
			f.off();
			cp.off();
			dp.off();
	 	}
		public static HomeTheaterRemote getHomeTheatre()
  		{
  			if(htr == null)
			{
	 			htr= new HomeTheaterRemote(l,f,p,pp,s,amf,cp,dp);
	 			return htr;
			}
			return htr;
		}
 }
