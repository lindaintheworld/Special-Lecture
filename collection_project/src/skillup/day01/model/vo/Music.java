package skillup.day01.model.vo;

public class Music {
	
	private String artist;
	private String title;
	
	private Music() {
		
	}
	
	public Music(String artist, String title) {
		this.artist = artist;
		this.title = title;
		
	}
	
	public String getArtist() {
		return artist;
		
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "[" + this.artist + ", " + this.title + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((artist == null) ? 0 : artist.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) //주소값이 같냐
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //Music이랑 class 타입이 같냐
			return false;
		Music other = (Music) obj;
		if (artist == null) {
			if (other.artist != null)
				return false;
		} else if (!artist.equals(other.artist))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	

}
