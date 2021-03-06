package com.syfri.digitalplan.model.importantparts;

import java.io.Serializable;
import java.util.List;

import com.syfri.baseapi.model.ValueObject;
import com.syfri.digitalplan.model.buildingzoning.WeixianjiezhiVO;
import com.syfri.digitalplan.model.buildingzoning.ChuguanVO;

public class ImportantpartsVO extends ValueObject implements Serializable{

	private static final long serialVersionUID = 1L;

	//重点部位基本信息
	private String zdbwid;	//重点部位ID（主键）
	private String zddwid;	//重点单位ID
	private String zdbwlx;	//重点部位类型
	private String zdbwmc;	//重点部位名称
	private String zdbwwz;	//重点部位位置
	private String wxxfx;	//危险性分析
	private String zysx;	//注意事项
	private String deleteFlag;	//删除标志
	private String datasource;	//数据来源[100000一体化]
	private String bz;	//备注
	private String jdh;	//节点号
	private String sjc;	//时间戳
	private String reserve1;	//备用字段1
	private String reserve2;	//备用字段2
	private String reserve3;	//备用字段3
	private String reserve4;	//备用字段4

	private String zdbwlxmc;	//重点部位类型名称

	//建筑类重点部位信息
	private String jzl_uuid;	//主键
	private String jzl_zdbwid;	//重点部位ID
	private String jzl_syxz;	//使用性质
	private String jzl_jzjg;	//建筑结构
	private String jzl_qymj;	//区域面积(㎡)
	private String jzl_gnms;	//功能描述
	private String jzl_deleteFlag;	//删除标志
	private String jzl_datasource;	//数据来源[100000一体化]
	private String jzl_jdh;	//节点号
	private String jzl_sjc;	//时间戳
	private String jzl_reserve1;	//备用字段1
	private String jzl_reserve2;	//备用字段2
	private String jzl_reserve3;	//备用字段3
	private String jzl_reserve4;	//备用字段4
	private List<WeixianjiezhiVO> WeixianjiezhiList;	//危险介质list

	private String jzl_jzjgmc;	//建筑结构名称

	//装置类重点部位信息
	private String zzl_uuid;	//主键
	private String zzl_zdbwid;	//重点部位ID
	private String zzl_jzjg;	//建筑结构
	private String zzl_zdmj;	//占地面积(㎡)
	private String zzl_zzgd;	//装置高度(m)
	private String zzl_zzzc;	//装置组成
	private String zzl_jsfzr;	//技术负责人
	private String zzl_jsfzrdh;	//技术负责人电话
	private String zzl_ylxx;	//原料信息
	private String zzl_cwxx;	//产物信息
	private String zzl_gylc;	//工艺流程
	private String zzl_deleteFlag;	//删除标志
	private String zzl_datasource;	//数据来源[100000一体化]
	private String zzl_jdh;	//节点号
	private String zzl_sjc;	//时间戳
	private String zzl_reserve1;	//备用字段1
	private String zzl_reserve2;	//备用字段2
	private String zzl_reserve3;	//备用字段3
	private String zzl_reserve4;	//备用字段4

	private String zzl_jzjgmc;	//建筑结构名称

	//储罐类重点部位信息
	private String cgl_uuid;	//主键
	private String cgl_zdbwid;	//重点部位ID
	private String cgl_zrj;	//总容积(m3)
	private String cgl_cgsl;	//储罐数量
	private String cgl_cgjg;	//储罐间隔
	private String cgl_ccjzms;	//存储介质描述
	private String cgl_jsfzr;	//技术负责人
	private String cgl_jsfzrdh;	//技术负责人电话
	private String cgl_plqkd;	//罐组毗邻情况(东)
	private String cgl_plqkn;	//罐组毗邻情况(南)
	private String cgl_plqkx;	//罐组毗邻情况(西)
	private String cgl_plqkb;	//罐组毗邻情况(北)
	private String cgl_deleteFlag;	//删除标志
	private String cgl_datasource;	//数据来源[100000一体化]
	private String cgl_jdh;	//节点号
	private String cgl_sjc;	//时间戳
	private String cgl_reserve1;	//备用字段1
	private String cgl_reserve2;	//备用字段2
	private String cgl_reserve3;	//备用字段3
	private String cgl_reserve4;	//备用字段4
	private List<ChuguanVO> ChuguanList;	//储罐list

	public String getZdbwid(){ return zdbwid; }
	public void setZdbwid(String zdbwid){ this.zdbwid = zdbwid; }
	public String getZddwid(){ return zddwid; }
	public void setZddwid(String zddwid){ this.zddwid = zddwid; }
	public String getZdbwlx(){ return zdbwlx; }
	public void setZdbwlx(String zdbwlx){ this.zdbwlx = zdbwlx; }
	public String getZdbwmc(){ return zdbwmc; }
	public void setZdbwmc(String zdbwmc){ this.zdbwmc = zdbwmc; }
	public String getZdbwwz(){ return zdbwwz; }
	public void setZdbwwz(String zdbwwz){ this.zdbwwz = zdbwwz; }
	public String getWxxfx(){ return wxxfx; }
	public void setWxxfx(String wxxfx){ this.wxxfx = wxxfx; }
	public String getZysx(){ return zysx; }
	public void setZysx(String zysx){ this.zysx = zysx; }
	public String getDeleteFlag(){ return deleteFlag; }
	public void setDeleteFlag(String deleteFlag){ this.deleteFlag = deleteFlag; }
	public String getDatasource(){ return datasource; }
	public void setDatasource(String datasource){ this.datasource = datasource; }
	public String getBz(){ return bz; }
	public void setBz(String bz){ this.bz = bz; }
	public String getJdh(){ return jdh; }
	public void setJdh(String jdh){ this.jdh = jdh; }
	public String getSjc(){ return sjc; }
	public void setSjc(String sjc){ this.sjc = sjc; }
	public String getReserve1(){ return reserve1; }
	public void setReserve1(String reserve1){ this.reserve1 = reserve1; }
	public String getReserve2(){ return reserve2; }
	public void setReserve2(String reserve2){ this.reserve2 = reserve2; }
	public String getReserve3(){ return reserve3; }
	public void setReserve3(String reserve3){ this.reserve3 = reserve3; }
	public String getReserve4(){ return reserve4; }
	public void setReserve4(String reserve4){ this.reserve4 = reserve4; }
	public String getZdbwlxmc() { return zdbwlxmc; }
	public void setZdbwlxmc(String zdbwlxmc) { this.zdbwlxmc = zdbwlxmc; }

	public String getJzl_uuid() {
		return jzl_uuid;
	}

	public void setJzl_uuid(String jzl_uuid) {
		this.jzl_uuid = jzl_uuid;
	}

	public String getJzl_zdbwid() {
		return jzl_zdbwid;
	}

	public void setJzl_zdbwid(String jzl_zdbwid) {
		this.jzl_zdbwid = jzl_zdbwid;
	}

	public String getJzl_syxz() {
		return jzl_syxz;
	}

	public void setJzl_syxz(String jzl_syxz) {
		this.jzl_syxz = jzl_syxz;
	}

	public String getJzl_jzjg() {
		return jzl_jzjg;
	}

	public void setJzl_jzjg(String jzl_jzjg) {
		this.jzl_jzjg = jzl_jzjg;
	}

	public String getJzl_qymj() {
		return jzl_qymj;
	}

	public void setJzl_qymj(String jzl_qymj) {
		this.jzl_qymj = jzl_qymj;
	}

	public String getJzl_gnms() {
		return jzl_gnms;
	}

	public void setJzl_gnms(String jzl_gnms) {
		this.jzl_gnms = jzl_gnms;
	}

	public String getJzl_deleteFlag() {
		return jzl_deleteFlag;
	}

	public void setJzl_deleteFlag(String jzl_deleteFlag) {
		this.jzl_deleteFlag = jzl_deleteFlag;
	}

	public String getJzl_datasource() {
		return jzl_datasource;
	}

	public void setJzl_datasource(String jzl_datasource) {
		this.jzl_datasource = jzl_datasource;
	}

	public String getJzl_jdh() {
		return jzl_jdh;
	}

	public void setJzl_jdh(String jzl_jdh) {
		this.jzl_jdh = jzl_jdh;
	}

	public String getJzl_sjc() {
		return jzl_sjc;
	}

	public void setJzl_sjc(String jzl_sjc) {
		this.jzl_sjc = jzl_sjc;
	}

	public String getJzl_reserve1() {
		return jzl_reserve1;
	}

	public void setJzl_reserve1(String jzl_reserve1) {
		this.jzl_reserve1 = jzl_reserve1;
	}

	public String getJzl_reserve2() {
		return jzl_reserve2;
	}

	public void setJzl_reserve2(String jzl_reserve2) {
		this.jzl_reserve2 = jzl_reserve2;
	}

	public String getJzl_reserve3() {
		return jzl_reserve3;
	}

	public void setJzl_reserve3(String jzl_reserve3) {
		this.jzl_reserve3 = jzl_reserve3;
	}

	public String getJzl_reserve4() {
		return jzl_reserve4;
	}

	public void setJzl_reserve4(String jzl_reserve4) {
		this.jzl_reserve4 = jzl_reserve4;
	}

	public List<WeixianjiezhiVO> getWeixianjiezhiList() {
		return WeixianjiezhiList;
	}

	public void setWeixianjiezhiList(List<WeixianjiezhiVO> weixianjiezhiList) {
		WeixianjiezhiList = weixianjiezhiList;
	}

	public String getJzl_jzjgmc() {
		return jzl_jzjgmc;
	}

	public void setJzl_jzjgmc(String jzl_jzjgmc) {
		this.jzl_jzjgmc = jzl_jzjgmc;
	}

	public String getZzl_uuid() {
		return zzl_uuid;
	}

	public void setZzl_uuid(String zzl_uuid) {
		this.zzl_uuid = zzl_uuid;
	}

	public String getZzl_zdbwid() {
		return zzl_zdbwid;
	}

	public void setZzl_zdbwid(String zzl_zdbwid) {
		this.zzl_zdbwid = zzl_zdbwid;
	}

	public String getZzl_jzjg() {
		return zzl_jzjg;
	}

	public void setZzl_jzjg(String zzl_jzjg) {
		this.zzl_jzjg = zzl_jzjg;
	}

	public String getZzl_zdmj() {
		return zzl_zdmj;
	}

	public void setZzl_zdmj(String zzl_zdmj) {
		this.zzl_zdmj = zzl_zdmj;
	}

	public String getZzl_zzgd() {
		return zzl_zzgd;
	}

	public void setZzl_zzgd(String zzl_zzgd) {
		this.zzl_zzgd = zzl_zzgd;
	}

	public String getZzl_zzzc() {
		return zzl_zzzc;
	}

	public void setZzl_zzzc(String zzl_zzzc) {
		this.zzl_zzzc = zzl_zzzc;
	}

	public String getZzl_jsfzr() {
		return zzl_jsfzr;
	}

	public void setZzl_jsfzr(String zzl_jsfzr) {
		this.zzl_jsfzr = zzl_jsfzr;
	}

	public String getZzl_jsfzrdh() {
		return zzl_jsfzrdh;
	}

	public void setZzl_jsfzrdh(String zzl_jsfzrdh) {
		this.zzl_jsfzrdh = zzl_jsfzrdh;
	}

	public String getZzl_ylxx() {
		return zzl_ylxx;
	}

	public void setZzl_ylxx(String zzl_ylxx) {
		this.zzl_ylxx = zzl_ylxx;
	}

	public String getZzl_cwxx() {
		return zzl_cwxx;
	}

	public void setZzl_cwxx(String zzl_cwxx) {
		this.zzl_cwxx = zzl_cwxx;
	}

	public String getZzl_gylc() {
		return zzl_gylc;
	}

	public void setZzl_gylc(String zzl_gylc) {
		this.zzl_gylc = zzl_gylc;
	}

	public String getZzl_deleteFlag() {
		return zzl_deleteFlag;
	}

	public void setZzl_deleteFlag(String zzl_deleteFlag) {
		this.zzl_deleteFlag = zzl_deleteFlag;
	}

	public String getZzl_datasource() {
		return zzl_datasource;
	}

	public void setZzl_datasource(String zzl_datasource) {
		this.zzl_datasource = zzl_datasource;
	}

	public String getZzl_jdh() {
		return zzl_jdh;
	}

	public void setZzl_jdh(String zzl_jdh) {
		this.zzl_jdh = zzl_jdh;
	}

	public String getZzl_sjc() {
		return zzl_sjc;
	}

	public void setZzl_sjc(String zzl_sjc) {
		this.zzl_sjc = zzl_sjc;
	}

	public String getZzl_reserve1() {
		return zzl_reserve1;
	}

	public void setZzl_reserve1(String zzl_reserve1) {
		this.zzl_reserve1 = zzl_reserve1;
	}

	public String getZzl_reserve2() {
		return zzl_reserve2;
	}

	public void setZzl_reserve2(String zzl_reserve2) {
		this.zzl_reserve2 = zzl_reserve2;
	}

	public String getZzl_reserve3() {
		return zzl_reserve3;
	}

	public void setZzl_reserve3(String zzl_reserve3) {
		this.zzl_reserve3 = zzl_reserve3;
	}

	public String getZzl_reserve4() {
		return zzl_reserve4;
	}

	public void setZzl_reserve4(String zzl_reserve4) {
		this.zzl_reserve4 = zzl_reserve4;
	}

	public String getZzl_jzjgmc() {
		return zzl_jzjgmc;
	}

	public void setZzl_jzjgmc(String zzl_jzjgmc) {
		this.zzl_jzjgmc = zzl_jzjgmc;
	}

	public String getCgl_uuid() {
		return cgl_uuid;
	}

	public void setCgl_uuid(String cgl_uuid) {
		this.cgl_uuid = cgl_uuid;
	}

	public String getCgl_zdbwid() {
		return cgl_zdbwid;
	}

	public void setCgl_zdbwid(String cgl_zdbwid) {
		this.cgl_zdbwid = cgl_zdbwid;
	}

	public String getCgl_zrj() {
		return cgl_zrj;
	}

	public void setCgl_zrj(String cgl_zrj) {
		this.cgl_zrj = cgl_zrj;
	}

	public String getCgl_cgsl() {
		return cgl_cgsl;
	}

	public void setCgl_cgsl(String cgl_cgsl) {
		this.cgl_cgsl = cgl_cgsl;
	}

	public String getCgl_cgjg() {
		return cgl_cgjg;
	}

	public void setCgl_cgjg(String cgl_cgjg) {
		this.cgl_cgjg = cgl_cgjg;
	}

	public String getCgl_ccjzms() {
		return cgl_ccjzms;
	}

	public void setCgl_ccjzms(String cgl_ccjzms) {
		this.cgl_ccjzms = cgl_ccjzms;
	}

	public String getCgl_jsfzr() {
		return cgl_jsfzr;
	}

	public void setCgl_jsfzr(String cgl_jsfzr) {
		this.cgl_jsfzr = cgl_jsfzr;
	}

	public String getCgl_jsfzrdh() {
		return cgl_jsfzrdh;
	}

	public void setCgl_jsfzrdh(String cgl_jsfzrdh) {
		this.cgl_jsfzrdh = cgl_jsfzrdh;
	}

	public String getCgl_plqkd() {
		return cgl_plqkd;
	}

	public void setCgl_plqkd(String cgl_plqkd) {
		this.cgl_plqkd = cgl_plqkd;
	}

	public String getCgl_plqkn() {
		return cgl_plqkn;
	}

	public void setCgl_plqkn(String cgl_plqkn) {
		this.cgl_plqkn = cgl_plqkn;
	}

	public String getCgl_plqkx() {
		return cgl_plqkx;
	}

	public void setCgl_plqkx(String cgl_plqkx) {
		this.cgl_plqkx = cgl_plqkx;
	}

	public String getCgl_plqkb() {
		return cgl_plqkb;
	}

	public void setCgl_plqkb(String cgl_plqkb) {
		this.cgl_plqkb = cgl_plqkb;
	}

	public String getCgl_deleteFlag() {
		return cgl_deleteFlag;
	}

	public void setCgl_deleteFlag(String cgl_deleteFlag) {
		this.cgl_deleteFlag = cgl_deleteFlag;
	}

	public String getCgl_datasource() {
		return cgl_datasource;
	}

	public void setCgl_datasource(String cgl_datasource) {
		this.cgl_datasource = cgl_datasource;
	}

	public String getCgl_jdh() {
		return cgl_jdh;
	}

	public void setCgl_jdh(String cgl_jdh) {
		this.cgl_jdh = cgl_jdh;
	}

	public String getCgl_sjc() {
		return cgl_sjc;
	}

	public void setCgl_sjc(String cgl_sjc) {
		this.cgl_sjc = cgl_sjc;
	}

	public String getCgl_reserve1() {
		return cgl_reserve1;
	}

	public void setCgl_reserve1(String cgl_reserve1) {
		this.cgl_reserve1 = cgl_reserve1;
	}

	public String getCgl_reserve2() {
		return cgl_reserve2;
	}

	public void setCgl_reserve2(String cgl_reserve2) {
		this.cgl_reserve2 = cgl_reserve2;
	}

	public String getCgl_reserve3() {
		return cgl_reserve3;
	}

	public void setCgl_reserve3(String cgl_reserve3) {
		this.cgl_reserve3 = cgl_reserve3;
	}

	public String getCgl_reserve4() {
		return cgl_reserve4;
	}

	public void setCgl_reserve4(String cgl_reserve4) {
		this.cgl_reserve4 = cgl_reserve4;
	}

	public List<ChuguanVO> getChuguanList() {
		return ChuguanList;
	}

	public void setChuguanList(List<ChuguanVO> chuguanList) {
		ChuguanList = chuguanList;
	}
}