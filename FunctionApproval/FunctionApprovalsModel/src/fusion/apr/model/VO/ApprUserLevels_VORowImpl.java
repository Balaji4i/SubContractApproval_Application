package fusion.apr.model.VO;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.domain.Number;
import oracle.jbo.domain.Timestamp;
import oracle.jbo.server.AttributeDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 01 23:47:52 IST 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ApprUserLevels_VORowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        UserLevelId {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getUserLevelId();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setUserLevelId((Number)value);
            }
        }
        ,
        UserGrpId {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getUserGrpId();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setUserGrpId((Number)value);
            }
        }
        ,
        LevelNo {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getLevelNo();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setLevelNo((Number)value);
            }
        }
        ,
        LevelName {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getLevelName();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setLevelName((String)value);
            }
        }
        ,
        LevelType {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getLevelType();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setLevelType((String)value);
            }
        }
        ,
        ApprByAll {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getApprByAll();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setApprByAll((String)value);
            }
        }
        ,
        ActiveYn {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getActiveYn();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setActiveYn((String)value);
            }
        }
        ,
        CreatedBy {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getCreatedBy();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setCreatedBy((String)value);
            }
        }
        ,
        CreationDate {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getCreationDate();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setCreationDate((Timestamp)value);
            }
        }
        ,
        LastUpdatedBy {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getLastUpdatedBy();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setLastUpdatedBy((String)value);
            }
        }
        ,
        LastUpdateDate {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getLastUpdateDate();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setLastUpdateDate((Timestamp)value);
            }
        }
        ,
        LastUpdateLogin {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getLastUpdateLogin();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setLastUpdateLogin((String)value);
            }
        }
        ,
        Trns_Active {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getTrns_Active();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setTrns_Active((Boolean)value);
            }
        }
        ,
        Trns_Active_2 {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getTrns_Active_2();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setTrns_Active_2((Boolean)value);
            }
        }
        ,
        ApprUsers_VO {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getApprUsers_VO();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ,
        ApprLvlType1 {
            public Object get(ApprUserLevels_VORowImpl obj) {
                return obj.getApprLvlType1();
            }

            public void put(ApprUserLevels_VORowImpl obj, Object value) {
                obj.setAttributeInternal(index(), value);
            }
        }
        ;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public abstract Object get(ApprUserLevels_VORowImpl object);

        public abstract void put(ApprUserLevels_VORowImpl object,
                                 Object value);

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int USERLEVELID = AttributesEnum.UserLevelId.index();
    public static final int USERGRPID = AttributesEnum.UserGrpId.index();
    public static final int LEVELNO = AttributesEnum.LevelNo.index();
    public static final int LEVELNAME = AttributesEnum.LevelName.index();
    public static final int LEVELTYPE = AttributesEnum.LevelType.index();
    public static final int APPRBYALL = AttributesEnum.ApprByAll.index();
    public static final int ACTIVEYN = AttributesEnum.ActiveYn.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int TRNS_ACTIVE = AttributesEnum.Trns_Active.index();
    public static final int TRNS_ACTIVE_2 = AttributesEnum.Trns_Active_2.index();
    public static final int APPRUSERS_VO = AttributesEnum.ApprUsers_VO.index();
    public static final int APPRLVLTYPE1 = AttributesEnum.ApprLvlType1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ApprUserLevels_VORowImpl() {
    }

    /**
     * Gets ApprUserLevels_EO entity object.
     * @return the ApprUserLevels_EO
     */
    public EntityImpl getApprUserLevels_EO() {
        return (EntityImpl)getEntity(0);
    }

    /**
     * Gets the attribute value for USER_LEVEL_ID using the alias name UserLevelId.
     * @return the USER_LEVEL_ID
     */
    public Number getUserLevelId() {
        return (Number) getAttributeInternal(USERLEVELID);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_LEVEL_ID using the alias name UserLevelId.
     * @param value value to set the USER_LEVEL_ID
     */
    public void setUserLevelId(Number value) {
        setAttributeInternal(USERLEVELID, value);
    }

    /**
     * Gets the attribute value for USER_GRP_ID using the alias name UserGrpId.
     * @return the USER_GRP_ID
     */
    public Number getUserGrpId() {
        return (Number) getAttributeInternal(USERGRPID);
    }

    /**
     * Sets <code>value</code> as attribute value for USER_GRP_ID using the alias name UserGrpId.
     * @param value value to set the USER_GRP_ID
     */
    public void setUserGrpId(Number value) {
        setAttributeInternal(USERGRPID, value);
    }

    /**
     * Gets the attribute value for LEVEL_NO using the alias name LevelNo.
     * @return the LEVEL_NO
     */
    public Number getLevelNo() {
        return (Number) getAttributeInternal(LEVELNO);
    }

    /**
     * Sets <code>value</code> as attribute value for LEVEL_NO using the alias name LevelNo.
     * @param value value to set the LEVEL_NO
     */
    public void setLevelNo(Number value) {
        setAttributeInternal(LEVELNO, value);
    }

    /**
     * Gets the attribute value for LEVEL_NAME using the alias name LevelName.
     * @return the LEVEL_NAME
     */
    public String getLevelName() {
        return (String) getAttributeInternal(LEVELNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for LEVEL_NAME using the alias name LevelName.
     * @param value value to set the LEVEL_NAME
     */
    public void setLevelName(String value) {
        setAttributeInternal(LEVELNAME, value);
    }

    /**
     * Gets the attribute value for LEVEL_TYPE using the alias name LevelType.
     * @return the LEVEL_TYPE
     */
    public String getLevelType() {
        return (String) getAttributeInternal(LEVELTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for LEVEL_TYPE using the alias name LevelType.
     * @param value value to set the LEVEL_TYPE
     */
    public void setLevelType(String value) {
        setAttributeInternal(LEVELTYPE, value);
    }

    /**
     * Gets the attribute value for APPR_BY_ALL using the alias name ApprByAll.
     * @return the APPR_BY_ALL
     */
    public String getApprByAll() {
        return (String) getAttributeInternal(APPRBYALL);
    }

    /**
     * Sets <code>value</code> as attribute value for APPR_BY_ALL using the alias name ApprByAll.
     * @param value value to set the APPR_BY_ALL
     */
    public void setApprByAll(String value) {
        setAttributeInternal(APPRBYALL, value);
    }

    /**
     * Gets the attribute value for ACTIVE_YN using the alias name ActiveYn.
     * @return the ACTIVE_YN
     */
    public String getActiveYn() {
        return (String) getAttributeInternal(ACTIVEYN);
    }

    /**
     * Sets <code>value</code> as attribute value for ACTIVE_YN using the alias name ActiveYn.
     * @param value value to set the ACTIVE_YN
     */
    public void setActiveYn(String value) {
        setAttributeInternal(ACTIVEYN, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Timestamp value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @return the LAST_UPDATE_LOGIN
     */
    public String getLastUpdateLogin() {
        return (String) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @param value value to set the LAST_UPDATE_LOGIN
     */
    public void setLastUpdateLogin(String value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Trns_Active.
     * @return the Trns_Active
     */
    public Boolean getTrns_Active() {
//        return (Boolean) getAttributeInternal(TRNS_ACTIVE);
                Boolean flag = false;
        if (this.getActiveYn() != null && this.getActiveYn().equals("Y")) {
            flag = true;
        //             System.err.println("flag"  + flag);
        } else {
            flag = false;
        //             System.err.println("flag"  + flag);
        }
        return flag;
        //
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trns_Active.
     * @param value value to set the  Trns_Active
     */
    public void setTrns_Active(Boolean value) {
        if (value) {
            setActiveYn("Y");
        } else {
            setActiveYn("N");
        }
        setAttributeInternal(TRNS_ACTIVE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Trns_Active_2.
     * @return the Trns_Active_2
     */
    public Boolean getTrns_Active_2() {
//        return (Boolean) getAttributeInternal(TRNS_ACTIVE_2);
        Boolean flag = false;
        if (this.getApprByAll() != null && this.getApprByAll().equals("Y")) {
            flag = true;
        //             System.err.println("flag"  + flag);
        } else {
            flag = false;
        //             System.err.println("flag"  + flag);
        }
        return flag;
        //
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trns_Active_2.
     * @param value value to set the  Trns_Active_2
     */
    public void setTrns_Active_2(Boolean value) {
        if (value) {
            setApprByAll("Y");
        } else {
            setApprByAll("N");
        }
        setAttributeInternal(TRNS_ACTIVE_2, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ApprUsers_VO.
     */
    public RowIterator getApprUsers_VO() {
        return (RowIterator)getAttributeInternal(APPRUSERS_VO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> ApprLvlType1.
     */
    public RowSet getApprLvlType1() {
        return (RowSet)getAttributeInternal(APPRLVLTYPE1);
    }

    /**
     * getAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param attrDef the attribute

     * @return the attribute value
     * @throws Exception
     */
    protected Object getAttrInvokeAccessor(int index,
                                           AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            return AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].get(this);
        }
        return super.getAttrInvokeAccessor(index, attrDef);
    }

    /**
     * setAttrInvokeAccessor: generated method. Do not modify.
     * @param index the index identifying the attribute
     * @param value the value to assign to the attribute
     * @param attrDef the attribute

     * @throws Exception
     */
    protected void setAttrInvokeAccessor(int index, Object value,
                                         AttributeDefImpl attrDef) throws Exception {
        if ((index >= AttributesEnum.firstIndex()) && (index < AttributesEnum.count())) {
            AttributesEnum.staticValues()[index - AttributesEnum.firstIndex()].put(this, value);
            return;
        }
        super.setAttrInvokeAccessor(index, value, attrDef);
    }
}
