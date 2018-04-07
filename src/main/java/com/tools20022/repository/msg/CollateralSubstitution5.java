/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04;
import com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code;
import com.tools20022.repository.codeset.CollateralSubstitutionType1Code;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CashCollateral5;
import com.tools20022.repository.msg.OtherCollateral7;
import com.tools20022.repository.msg.Reference17;
import com.tools20022.repository.msg.SecuritiesCollateral7;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the collateral that will be substituted.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmCollateralSubstitutionSequence
 * CollateralSubstitution5.mmCollateralSubstitutionSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmSubstitutionRequirement
 * CollateralSubstitution5.mmSubstitutionRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmCollateralSubstitutionType
 * CollateralSubstitution5.mmCollateralSubstitutionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmStandardSettlementInstructions
 * CollateralSubstitution5.mmStandardSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmSecuritiesCollateral
 * CollateralSubstitution5.mmSecuritiesCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmCashCollateral
 * CollateralSubstitution5.mmCashCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmOtherCollateral
 * CollateralSubstitution5.mmOtherCollateral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5#mmLinkedReferences
 * CollateralSubstitution5.mmLinkedReferences}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralSubstitution
 * CollateralSubstitution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionRequestV04#mmCollateralSubstitutionReturn
 * CollateralSubstitutionRequestV04.mmCollateralSubstitutionReturn}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule#forCollateralSubstitution5
 * ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralSubstitution5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details about the collateral that will be substituted."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralSubstitution5", propOrder = {"collateralSubstitutionSequence", "substitutionRequirement", "collateralSubstitutionType", "standardSettlementInstructions", "securitiesCollateral", "cashCollateral",
		"otherCollateral", "linkedReferences"})
public class CollateralSubstitution5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CollSbstitnSeq", required = true)
	protected CollateralSubstitutionSequence1Code collateralSubstitutionSequence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionSequence1Code
	 * CollateralSubstitutionSequence1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5
	 * CollateralSubstitution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnSeq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the collateral substitution request is new or updated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralSubstitution5, CollateralSubstitutionSequence1Code> mmCollateralSubstitutionSequence = new MMMessageAttribute<CollateralSubstitution5, CollateralSubstitutionSequence1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitution5.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnSeq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionSequence";
			definition = "Indicates whether the collateral substitution request is new or updated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralSubstitutionSequence1Code.mmObject();
		}

		@Override
		public CollateralSubstitutionSequence1Code getValue(CollateralSubstitution5 obj) {
			return obj.getCollateralSubstitutionSequence();
		}

		@Override
		public void setValue(CollateralSubstitution5 obj, CollateralSubstitutionSequence1Code value) {
			obj.setCollateralSubstitutionSequence(value);
		}
	};
	@XmlElement(name = "SbstitnRqrmnt", required = true)
	protected ActiveCurrencyAndAmount substitutionRequirement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmBaseCurrencyAmount
	 * Collateral.mmBaseCurrencyAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5
	 * CollateralSubstitution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SbstitnRqrmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubstitutionRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash value of the requested collateral substitution transfer in the base currency."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralSubstitution5, ActiveCurrencyAndAmount> mmSubstitutionRequirement = new MMMessageAttribute<CollateralSubstitution5, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmBaseCurrencyAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitution5.mmObject();
			isDerived = false;
			xmlTag = "SbstitnRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubstitutionRequirement";
			definition = "Cash value of the requested collateral substitution transfer in the base currency.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(CollateralSubstitution5 obj) {
			return obj.getSubstitutionRequirement();
		}

		@Override
		public void setValue(CollateralSubstitution5 obj, ActiveCurrencyAndAmount value) {
			obj.setSubstitutionRequirement(value);
		}
	};
	@XmlElement(name = "CollSbstitnTp", required = true)
	protected CollateralSubstitutionType1Code collateralSubstitutionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionType1Code
	 * CollateralSubstitutionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution#mmType
	 * CollateralSubstitution.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5
	 * CollateralSubstitution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies if the collateral that is substituted was posted against the variation margin or the independent amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralSubstitution5, CollateralSubstitutionType1Code> mmCollateralSubstitutionType = new MMMessageAttribute<CollateralSubstitution5, CollateralSubstitutionType1Code>() {
		{
			businessElementTrace_lazy = () -> CollateralSubstitution.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitution5.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionType";
			definition = "Specifies if the collateral that is substituted was posted against the variation margin or the independent amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralSubstitutionType1Code.mmObject();
		}

		@Override
		public CollateralSubstitutionType1Code getValue(CollateralSubstitution5 obj) {
			return obj.getCollateralSubstitutionType();
		}

		@Override
		public void setValue(CollateralSubstitution5 obj, CollateralSubstitutionType1Code value) {
			obj.setCollateralSubstitutionType(value);
		}
	};
	@XmlElement(name = "StdSttlmInstrs")
	protected Max140Text standardSettlementInstructions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralAgreement#mmStandingSettlementInstructions
	 * CollateralAgreement.mmStandingSettlementInstructions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5
	 * CollateralSubstitution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StdSttlmInstrs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandardSettlementInstructions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the standard settlement instructions."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralSubstitution5, Optional<Max140Text>> mmStandardSettlementInstructions = new MMMessageAttribute<CollateralSubstitution5, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> CollateralAgreement.mmStandingSettlementInstructions;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitution5.mmObject();
			isDerived = false;
			xmlTag = "StdSttlmInstrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandardSettlementInstructions";
			definition = "Identifies the standard settlement instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(CollateralSubstitution5 obj) {
			return obj.getStandardSettlementInstructions();
		}

		@Override
		public void setValue(CollateralSubstitution5 obj, Optional<Max140Text> value) {
			obj.setStandardSettlementInstructions(value.orElse(null));
		}
	};
	@XmlElement(name = "SctiesColl")
	protected List<SecuritiesCollateral7> securitiesCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecuritiesCollateral7
	 * SecuritiesCollateral7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5
	 * CollateralSubstitution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is securities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralSubstitution5, List<SecuritiesCollateral7>> mmSecuritiesCollateral = new MMMessageAssociationEnd<CollateralSubstitution5, List<SecuritiesCollateral7>>() {
		{
			businessComponentTrace_lazy = () -> Security.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitution5.mmObject();
			isDerived = false;
			xmlTag = "SctiesColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesCollateral";
			definition = "Collateral type is securities.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SecuritiesCollateral7.mmObject();
		}

		@Override
		public List<SecuritiesCollateral7> getValue(CollateralSubstitution5 obj) {
			return obj.getSecuritiesCollateral();
		}

		@Override
		public void setValue(CollateralSubstitution5 obj, List<SecuritiesCollateral7> value) {
			obj.setSecuritiesCollateral(value);
		}
	};
	@XmlElement(name = "CshColl")
	protected List<CashCollateral5> cashCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashCollateral5
	 * CashCollateral5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Money Money}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5
	 * CollateralSubstitution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collateral type is cash."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralSubstitution5, List<CashCollateral5>> mmCashCollateral = new MMMessageAssociationEnd<CollateralSubstitution5, List<CashCollateral5>>() {
		{
			businessComponentTrace_lazy = () -> Money.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitution5.mmObject();
			isDerived = false;
			xmlTag = "CshColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashCollateral";
			definition = "Collateral type is cash.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CashCollateral5.mmObject();
		}

		@Override
		public List<CashCollateral5> getValue(CollateralSubstitution5 obj) {
			return obj.getCashCollateral();
		}

		@Override
		public void setValue(CollateralSubstitution5 obj, List<CashCollateral5> value) {
			obj.setCashCollateral(value);
		}
	};
	@XmlElement(name = "OthrColl")
	protected List<OtherCollateral7> otherCollateral;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherCollateral7
	 * OtherCollateral7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Asset Asset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5
	 * CollateralSubstitution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrColl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherCollateral"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Collateral type is other than securities or cash for example letter of credit."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralSubstitution5, List<OtherCollateral7>> mmOtherCollateral = new MMMessageAssociationEnd<CollateralSubstitution5, List<OtherCollateral7>>() {
		{
			businessComponentTrace_lazy = () -> Asset.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitution5.mmObject();
			isDerived = false;
			xmlTag = "OthrColl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherCollateral";
			definition = "Collateral type is other than securities or cash for example letter of credit.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OtherCollateral7.mmObject();
		}

		@Override
		public List<OtherCollateral7> getValue(CollateralSubstitution5 obj) {
			return obj.getOtherCollateral();
		}

		@Override
		public void setValue(CollateralSubstitution5 obj, List<OtherCollateral7> value) {
			obj.setOtherCollateral(value);
		}
	};
	@XmlElement(name = "LkdRefs")
	protected Reference17 linkedReferences;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Reference17
	 * Reference17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitution5
	 * CollateralSubstitution5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdRefs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedReferences"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the identification of previously sent and/or received message(s), in case of updated substitution request."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralSubstitution5, Optional<Reference17>> mmLinkedReferences = new MMMessageAssociationEnd<CollateralSubstitution5, Optional<Reference17>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralSubstitution5.mmObject();
			isDerived = false;
			xmlTag = "LkdRefs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedReferences";
			definition = "Provides details on the identification of previously sent and/or received message(s), in case of updated substitution request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Reference17.mmObject();
		}

		@Override
		public Optional<Reference17> getValue(CollateralSubstitution5 obj) {
			return obj.getLinkedReferences();
		}

		@Override
		public void setValue(CollateralSubstitution5 obj, Optional<Reference17> value) {
			obj.setLinkedReferences(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralSubstitution5.mmCollateralSubstitutionSequence, com.tools20022.repository.msg.CollateralSubstitution5.mmSubstitutionRequirement,
						com.tools20022.repository.msg.CollateralSubstitution5.mmCollateralSubstitutionType, com.tools20022.repository.msg.CollateralSubstitution5.mmStandardSettlementInstructions,
						com.tools20022.repository.msg.CollateralSubstitution5.mmSecuritiesCollateral, com.tools20022.repository.msg.CollateralSubstitution5.mmCashCollateral,
						com.tools20022.repository.msg.CollateralSubstitution5.mmOtherCollateral, com.tools20022.repository.msg.CollateralSubstitution5.mmLinkedReferences);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralSubstitutionRequestV04.mmCollateralSubstitutionReturn);
				trace_lazy = () -> CollateralSubstitution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSubstitutionRequestSequenceRule.forCollateralSubstitution5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralSubstitution5";
				definition = "Provides details about the collateral that will be substituted.";
			}
		});
		return mmObject_lazy.get();
	}

	public CollateralSubstitutionSequence1Code getCollateralSubstitutionSequence() {
		return collateralSubstitutionSequence;
	}

	public CollateralSubstitution5 setCollateralSubstitutionSequence(CollateralSubstitutionSequence1Code collateralSubstitutionSequence) {
		this.collateralSubstitutionSequence = Objects.requireNonNull(collateralSubstitutionSequence);
		return this;
	}

	public ActiveCurrencyAndAmount getSubstitutionRequirement() {
		return substitutionRequirement;
	}

	public CollateralSubstitution5 setSubstitutionRequirement(ActiveCurrencyAndAmount substitutionRequirement) {
		this.substitutionRequirement = Objects.requireNonNull(substitutionRequirement);
		return this;
	}

	public CollateralSubstitutionType1Code getCollateralSubstitutionType() {
		return collateralSubstitutionType;
	}

	public CollateralSubstitution5 setCollateralSubstitutionType(CollateralSubstitutionType1Code collateralSubstitutionType) {
		this.collateralSubstitutionType = Objects.requireNonNull(collateralSubstitutionType);
		return this;
	}

	public Optional<Max140Text> getStandardSettlementInstructions() {
		return standardSettlementInstructions == null ? Optional.empty() : Optional.of(standardSettlementInstructions);
	}

	public CollateralSubstitution5 setStandardSettlementInstructions(Max140Text standardSettlementInstructions) {
		this.standardSettlementInstructions = standardSettlementInstructions;
		return this;
	}

	public List<SecuritiesCollateral7> getSecuritiesCollateral() {
		return securitiesCollateral == null ? securitiesCollateral = new ArrayList<>() : securitiesCollateral;
	}

	public CollateralSubstitution5 setSecuritiesCollateral(List<SecuritiesCollateral7> securitiesCollateral) {
		this.securitiesCollateral = Objects.requireNonNull(securitiesCollateral);
		return this;
	}

	public List<CashCollateral5> getCashCollateral() {
		return cashCollateral == null ? cashCollateral = new ArrayList<>() : cashCollateral;
	}

	public CollateralSubstitution5 setCashCollateral(List<CashCollateral5> cashCollateral) {
		this.cashCollateral = Objects.requireNonNull(cashCollateral);
		return this;
	}

	public List<OtherCollateral7> getOtherCollateral() {
		return otherCollateral == null ? otherCollateral = new ArrayList<>() : otherCollateral;
	}

	public CollateralSubstitution5 setOtherCollateral(List<OtherCollateral7> otherCollateral) {
		this.otherCollateral = Objects.requireNonNull(otherCollateral);
		return this;
	}

	public Optional<Reference17> getLinkedReferences() {
		return linkedReferences == null ? Optional.empty() : Optional.of(linkedReferences);
	}

	public CollateralSubstitution5 setLinkedReferences(Reference17 linkedReferences) {
		this.linkedReferences = linkedReferences;
		return this;
	}
}