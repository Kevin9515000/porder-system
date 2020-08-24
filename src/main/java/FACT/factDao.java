package FACT;

import Dao.member.memberDao;
import Dao.message.messageDao;
import Dao.porder.porderDao;

public class factDao {
	private memberDao md;
	private porderDao pd;
	private messageDao msg;
	public memberDao getMd() {
		return md;
	}
	public void setMd(memberDao md) {
		this.md = md;
	}
	public porderDao getPd() {
		return pd;
	}
	public void setPd(porderDao pd) {
		this.pd = pd;
	}
	public messageDao getMsg() {
		return msg;
	}
	public void setMsg(messageDao msg) {
		this.msg = msg;
	}
}
