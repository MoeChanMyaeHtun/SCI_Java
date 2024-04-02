package com.sci;

public enum Music {
	
	ROCK("Wheels"){
		public void playSong() {
			System.out.println("playing: a song");
		}
		public String getSong() {
			return super.song;
		}
	},POP("Hello"){
		public void playSong() {
			System.out.println("playing: a song");
		}
		public String getSong() {
			return super.song;
		}
	},RAP("Rap God"){
		public void playSong() {
			System.out.println("playing: a song");
		}
		public String getSong() {
			return super.getSong();
		}
	};
	private String song;

	Music(String song){
		System.out.println("music constructor");
	}
	
	public String getSong() {
		return song;
	}
	
	public abstract void playSong();
}
