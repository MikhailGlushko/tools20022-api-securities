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
import com.tools20022.repository.area.colr.InterestPaymentRequestV04;
import com.tools20022.repository.choice.CollateralPurpose1Choice;
import com.tools20022.repository.choice.InterestRate1Choice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Collateral;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.InterestCalculation;
import com.tools20022.repository.entity.Settlement;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralBalance1;
import com.tools20022.repository.msg.DatePeriodDetails;
import com.tools20022.repository.msg.Reference20;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides the elements related to the interest amount calculation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmInterestRequestSequence
 * InterestAmount1.mmInterestRequestSequence}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmInterestPeriod
 * InterestAmount1.mmInterestPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmAccruedInterestAmount
 * InterestAmount1.mmAccruedInterestAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestAmount1#mmValueDate
 * InterestAmount1.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmInterestMethod
 * InterestAmount1.mmInterestMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.InterestAmount1#mmInterestRate
 * InterestAmount1.mmInterestRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmDayCountBasis
 * InterestAmount1.mmDayCountBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmAppliedWithholdingTax
 * InterestAmount1.mmAppliedWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmCalculationMethod
 * InterestAmount1.mmCalculationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmCalculationFrequency
 * InterestAmount1.mmCalculationFrequency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmCollateralPurpose
 * InterestAmount1.mmCollateralPurpose}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmOpeningCollateralBalance
 * InterestAmount1.mmOpeningCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmClosingCollateralBalance
 * InterestAmount1.mmClosingCollateralBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmStandardSettlementInstructions
 * InterestAmount1.mmStandardSettlementInstructions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmAdditionalInformation
 * InterestAmount1.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InterestAmount1#mmReferenceDetails
 * InterestAmount1.mmReferenceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmInterestDueToA
 * InterestPaymentRequestV04.mmInterestDueToA}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.InterestPaymentRequestV04#mmInterestDueToB
 * InterestPaymentRequestV04.mmInterestDueToB}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintInterestRequestSequenceRule#forInterestAmount1
 * ConstraintInterestRequestSequenceRule.forInterestAmount1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InterestAmount1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the elements related to the interest amount calculation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InterestAmount1", propOrder = {"interestRequestSequence", "interestPeriod", "accruedInterestAmount", "valueDate", "interestMethod", "interestRate", "dayCountBasis", "appliedWithholdingTax", "calculationMethod",
		"calculationFrequency", "collateralPurpose", "openingCollateralBalance", "closingCollateralBalance", "standardSettlementInstructions", "additionalInformation", "referenceDetails"})
public class InterestAmount1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IntrstReqSeq", required = true)
	protected InterestRequestSequence1Code interestRequestSequence;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestRequestSequence1Code
	 * InterestRequestSequence1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstReqSeq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRequestSequence"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the interest request is new or updated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestAmount1, InterestRequestSequence1Code> mmInterestRequestSequence = new MMMessageAttribute<InterestAmount1, InterestRequestSequence1Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "IntrstReqSeq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRequestSequence";
			definition = "Indicates whether the interest request is new or updated.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestRequestSequence1Code.mmObject();
		}

		@Override
		public InterestRequestSequence1Code getValue(InterestAmount1 obj) {
			return obj.getInterestRequestSequence();
		}

		@Override
		public void setValue(InterestAmount1 obj, InterestRequestSequence1Code value) {
			obj.setInterestRequestSequence(value);
		}
	};
	@XmlElement(name = "IntrstPrd", required = true)
	protected DatePeriodDetails interestPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DatePeriodDetails
	 * DatePeriodDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestPeriod
	 * InterestCalculation.mmInterestPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period for which the calculation has been performed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestAmount1, DatePeriodDetails> mmInterestPeriod = new MMMessageAttribute<InterestAmount1, DatePeriodDetails>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestPeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "IntrstPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPeriod";
			definition = "Period for which the calculation has been performed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DatePeriodDetails.mmObject();
		}

		@Override
		public DatePeriodDetails getValue(InterestAmount1 obj) {
			return obj.getInterestPeriod();
		}

		@Override
		public void setValue(InterestAmount1 obj, DatePeriodDetails value) {
			obj.setInterestPeriod(value);
		}
	};
	@XmlElement(name = "AcrdIntrstAmt", required = true)
	protected ActiveCurrencyAndAmount accruedInterestAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Interest#mmAccruedInterestAmount
	 * Interest.mmAccruedInterestAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcrdIntrstAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccruedInterestAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of money representing an interest payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestAmount1, ActiveCurrencyAndAmount> mmAccruedInterestAmount = new MMMessageAttribute<InterestAmount1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> Interest.mmAccruedInterestAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "AcrdIntrstAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccruedInterestAmount";
			definition = "Amount of money representing an interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(InterestAmount1 obj) {
			return obj.getAccruedInterestAmount();
		}

		@Override
		public void setValue(InterestAmount1 obj, ActiveCurrencyAndAmount value) {
			obj.setAccruedInterestAmount(value);
		}
	};
	@XmlElement(name = "ValDt", required = true)
	protected ISODate valueDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmPaymentDate
	 * Interest.mmPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Agreed date for the interest payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestAmount1, ISODate> mmValueDate = new MMMessageAttribute<InterestAmount1, ISODate>() {
		{
			businessElementTrace_lazy = () -> Interest.mmPaymentDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "ValDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueDate";
			definition = "Agreed date for the interest payment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(InterestAmount1 obj) {
			return obj.getValueDate();
		}

		@Override
		public void setValue(InterestAmount1 obj, ISODate value) {
			obj.setValueDate(value);
		}
	};
	@XmlElement(name = "IntrstMtd", required = true)
	protected InterestMethod1Code interestMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestMethod1Code
	 * InterestMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmInterestMethod
	 * InterestCalculation.mmInterestMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestAmount1, InterestMethod1Code> mmInterestMethod = new MMMessageAttribute<InterestAmount1, InterestMethod1Code>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmInterestMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "IntrstMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestMethod";
			definition = "Indicates whether the interest will be settled in cash or rolled in the existing collateral balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> InterestMethod1Code.mmObject();
		}

		@Override
		public InterestMethod1Code getValue(InterestAmount1 obj) {
			return obj.getInterestMethod();
		}

		@Override
		public void setValue(InterestAmount1 obj, InterestMethod1Code value) {
			obj.setInterestMethod(value);
		}
	};
	@XmlElement(name = "IntrstRate")
	protected InterestRate1Choice interestRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.InterestRate1Choice
	 * InterestRate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestAmount1, Optional<InterestRate1Choice>> mmInterestRate = new MMMessageAttribute<InterestAmount1, Optional<InterestRate1Choice>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "IntrstRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestRate";
			definition = "Percentage charged for the use of an amount of money, usually expressed at an annual rate. The interest rate is the ratio of the amount of interest paid during a certain period of time compared to the principal amount of the interest bearing financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InterestRate1Choice.mmObject();
		}

		@Override
		public Optional<InterestRate1Choice> getValue(InterestAmount1 obj) {
			return obj.getInterestRate();
		}

		@Override
		public void setValue(InterestAmount1 obj, Optional<InterestRate1Choice> value) {
			obj.setInterestRate(value.orElse(null));
		}
	};
	@XmlElement(name = "DayCntBsis")
	protected InterestComputationMethod2Code dayCountBasis;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.InterestComputationMethod2Code
	 * InterestComputationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmDayCountBasis
	 * InterestCalculation.mmDayCountBasis}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DayCntBsis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayCountBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the computation method of (accrued) interest of the security."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestAmount1, Optional<InterestComputationMethod2Code>> mmDayCountBasis = new MMMessageAttribute<InterestAmount1, Optional<InterestComputationMethod2Code>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmDayCountBasis;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "DayCntBsis";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayCountBasis";
			definition = "Specifies the computation method of (accrued) interest of the security.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> InterestComputationMethod2Code.mmObject();
		}

		@Override
		public Optional<InterestComputationMethod2Code> getValue(InterestAmount1 obj) {
			return obj.getDayCountBasis();
		}

		@Override
		public void setValue(InterestAmount1 obj, Optional<InterestComputationMethod2Code> value) {
			obj.setDayCountBasis(value.orElse(null));
		}
	};
	@XmlElement(name = "ApldWhldgTax")
	protected YesNoIndicator appliedWithholdingTax;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmInterestTax
	 * Interest.mmInterestTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApldWhldgTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AppliedWithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount or percentage of a cash distribution that will be withheld by a tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestAmount1, Optional<YesNoIndicator>> mmAppliedWithholdingTax = new MMMessageAttribute<InterestAmount1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmInterestTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "ApldWhldgTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AppliedWithholdingTax";
			definition = "Amount or percentage of a cash distribution that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(InterestAmount1 obj) {
			return obj.getAppliedWithholdingTax();
		}

		@Override
		public void setValue(InterestAmount1 obj, Optional<YesNoIndicator> value) {
			obj.setAppliedWithholdingTax(value.orElse(null));
		}
	};
	@XmlElement(name = "ClctnMtd")
	protected CalculationMethod1Code calculationMethod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CalculationMethod1Code
	 * CalculationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationMethod
	 * InterestCalculation.mmCalculationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the interest is simple or compounded."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestAmount1, Optional<CalculationMethod1Code>> mmCalculationMethod = new MMMessageAttribute<InterestAmount1, Optional<CalculationMethod1Code>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmCalculationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "ClctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationMethod";
			definition = "Specifies whether the interest is simple or compounded.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CalculationMethod1Code.mmObject();
		}

		@Override
		public Optional<CalculationMethod1Code> getValue(InterestAmount1 obj) {
			return obj.getCalculationMethod();
		}

		@Override
		public void setValue(InterestAmount1 obj, Optional<CalculationMethod1Code> value) {
			obj.setCalculationMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "ClctnFrqcy")
	protected Frequency1Code calculationFrequency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Frequency1Code
	 * Frequency1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InterestCalculation#mmCalculationFrequency
	 * InterestCalculation.mmCalculationFrequency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctnFrqcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationFrequency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the periodicity of the calculation of the interest."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestAmount1, Optional<Frequency1Code>> mmCalculationFrequency = new MMMessageAttribute<InterestAmount1, Optional<Frequency1Code>>() {
		{
			businessElementTrace_lazy = () -> InterestCalculation.mmCalculationFrequency;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "ClctnFrqcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculationFrequency";
			definition = "Specifies the periodicity of the calculation of the interest.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Frequency1Code.mmObject();
		}

		@Override
		public Optional<Frequency1Code> getValue(InterestAmount1 obj) {
			return obj.getCalculationFrequency();
		}

		@Override
		public void setValue(InterestAmount1 obj, Optional<Frequency1Code> value) {
			obj.setCalculationFrequency(value.orElse(null));
		}
	};
	@XmlElement(name = "CollPurp", required = true)
	protected CollateralPurpose1Choice collateralPurpose;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CollateralPurpose1Choice
	 * CollateralPurpose1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralPurpose
	 * Collateral.mmCollateralPurpose}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPurp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralPurpose"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the collateral has been posted against the variation margin, the segregated independent amount or to cover any other risk defined with a proprietary code."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestAmount1, CollateralPurpose1Choice> mmCollateralPurpose = new MMMessageAttribute<InterestAmount1, CollateralPurpose1Choice>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralPurpose;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "CollPurp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralPurpose";
			definition = "Specifies whether the collateral has been posted against the variation margin, the segregated independent amount or to cover any other risk defined with a proprietary code.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CollateralPurpose1Choice.mmObject();
		}

		@Override
		public CollateralPurpose1Choice getValue(InterestAmount1 obj) {
			return obj.getCollateralPurpose();
		}

		@Override
		public void setValue(InterestAmount1 obj, CollateralPurpose1Choice value) {
			obj.setCollateralPurpose(value);
		}
	};
	@XmlElement(name = "OpngCollBal")
	protected CollateralBalance1 openingCollateralBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralBalance1
	 * CollateralBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralBalance
	 * Collateral.mmCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpngCollBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpeningCollateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the opening collateral balance."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InterestAmount1, Optional<CollateralBalance1>> mmOpeningCollateralBalance = new MMMessageAssociationEnd<InterestAmount1, Optional<CollateralBalance1>>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "OpngCollBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpeningCollateralBalance";
			definition = "Provides details about the opening collateral balance.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CollateralBalance1.mmObject();
		}

		@Override
		public Optional<CollateralBalance1> getValue(InterestAmount1 obj) {
			return obj.getOpeningCollateralBalance();
		}

		@Override
		public void setValue(InterestAmount1 obj, Optional<CollateralBalance1> value) {
			obj.setOpeningCollateralBalance(value.orElse(null));
		}
	};
	@XmlElement(name = "ClsgCollBal", required = true)
	protected CollateralBalance1 closingCollateralBalance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralBalance1
	 * CollateralBalance1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Collateral#mmCollateralBalance
	 * Collateral.mmCollateralBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClsgCollBal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosingCollateralBalance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides details about the closing collateral balance."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InterestAmount1, CollateralBalance1> mmClosingCollateralBalance = new MMMessageAssociationEnd<InterestAmount1, CollateralBalance1>() {
		{
			businessElementTrace_lazy = () -> Collateral.mmCollateralBalance;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "ClsgCollBal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosingCollateralBalance";
			definition = "Provides details about the closing collateral balance.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralBalance1.mmObject();
		}

		@Override
		public CollateralBalance1 getValue(InterestAmount1 obj) {
			return obj.getClosingCollateralBalance();
		}

		@Override
		public void setValue(InterestAmount1 obj, CollateralBalance1 value) {
			obj.setClosingCollateralBalance(value);
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
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
	 * Settlement.mmStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
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
	public static final MMMessageAttribute<InterestAmount1, Optional<Max140Text>> mmStandardSettlementInstructions = new MMMessageAttribute<InterestAmount1, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> Settlement.mmStandingSettlementInstruction;
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
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
		public Optional<Max140Text> getValue(InterestAmount1 obj) {
			return obj.getStandardSettlementInstructions();
		}

		@Override
		public void setValue(InterestAmount1 obj, Optional<Max140Text> value) {
			obj.setStandardSettlementInstructions(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max210Text additionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max210Text
	 * Max210Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additionnal information related to interest request."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<InterestAmount1, Optional<Max210Text>> mmAdditionalInformation = new MMMessageAttribute<InterestAmount1, Optional<Max210Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additionnal information related to interest request.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max210Text.mmObject();
		}

		@Override
		public Optional<Max210Text> getValue(InterestAmount1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(InterestAmount1 obj, Optional<Max210Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "RefDtls")
	protected Reference20 referenceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Reference20
	 * Reference20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InterestAmount1
	 * InterestAmount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional references linked to the updated interest payement request."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<InterestAmount1, Optional<Reference20>> mmReferenceDetails = new MMMessageAssociationEnd<InterestAmount1, Optional<Reference20>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InterestAmount1.mmObject();
			isDerived = false;
			xmlTag = "RefDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceDetails";
			definition = "Additional references linked to the updated interest payement request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Reference20.mmObject();
		}

		@Override
		public Optional<Reference20> getValue(InterestAmount1 obj) {
			return obj.getReferenceDetails();
		}

		@Override
		public void setValue(InterestAmount1 obj, Optional<Reference20> value) {
			obj.setReferenceDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.msg.InterestAmount1.mmInterestRequestSequence, com.tools20022.repository.msg.InterestAmount1.mmInterestPeriod, com.tools20022.repository.msg.InterestAmount1.mmAccruedInterestAmount,
								com.tools20022.repository.msg.InterestAmount1.mmValueDate, com.tools20022.repository.msg.InterestAmount1.mmInterestMethod, com.tools20022.repository.msg.InterestAmount1.mmInterestRate,
								com.tools20022.repository.msg.InterestAmount1.mmDayCountBasis, com.tools20022.repository.msg.InterestAmount1.mmAppliedWithholdingTax, com.tools20022.repository.msg.InterestAmount1.mmCalculationMethod,
								com.tools20022.repository.msg.InterestAmount1.mmCalculationFrequency, com.tools20022.repository.msg.InterestAmount1.mmCollateralPurpose,
								com.tools20022.repository.msg.InterestAmount1.mmOpeningCollateralBalance, com.tools20022.repository.msg.InterestAmount1.mmClosingCollateralBalance,
								com.tools20022.repository.msg.InterestAmount1.mmStandardSettlementInstructions, com.tools20022.repository.msg.InterestAmount1.mmAdditionalInformation,
								com.tools20022.repository.msg.InterestAmount1.mmReferenceDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(InterestPaymentRequestV04.mmInterestDueToA, InterestPaymentRequestV04.mmInterestDueToB);
				trace_lazy = () -> Interest.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintInterestRequestSequenceRule.forInterestAmount1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InterestAmount1";
				definition = "Provides the elements related to the interest amount calculation.";
			}
		});
		return mmObject_lazy.get();
	}

	public InterestRequestSequence1Code getInterestRequestSequence() {
		return interestRequestSequence;
	}

	public InterestAmount1 setInterestRequestSequence(InterestRequestSequence1Code interestRequestSequence) {
		this.interestRequestSequence = Objects.requireNonNull(interestRequestSequence);
		return this;
	}

	public DatePeriodDetails getInterestPeriod() {
		return interestPeriod;
	}

	public InterestAmount1 setInterestPeriod(DatePeriodDetails interestPeriod) {
		this.interestPeriod = Objects.requireNonNull(interestPeriod);
		return this;
	}

	public ActiveCurrencyAndAmount getAccruedInterestAmount() {
		return accruedInterestAmount;
	}

	public InterestAmount1 setAccruedInterestAmount(ActiveCurrencyAndAmount accruedInterestAmount) {
		this.accruedInterestAmount = Objects.requireNonNull(accruedInterestAmount);
		return this;
	}

	public ISODate getValueDate() {
		return valueDate;
	}

	public InterestAmount1 setValueDate(ISODate valueDate) {
		this.valueDate = Objects.requireNonNull(valueDate);
		return this;
	}

	public InterestMethod1Code getInterestMethod() {
		return interestMethod;
	}

	public InterestAmount1 setInterestMethod(InterestMethod1Code interestMethod) {
		this.interestMethod = Objects.requireNonNull(interestMethod);
		return this;
	}

	public Optional<InterestRate1Choice> getInterestRate() {
		return interestRate == null ? Optional.empty() : Optional.of(interestRate);
	}

	public InterestAmount1 setInterestRate(InterestRate1Choice interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public Optional<InterestComputationMethod2Code> getDayCountBasis() {
		return dayCountBasis == null ? Optional.empty() : Optional.of(dayCountBasis);
	}

	public InterestAmount1 setDayCountBasis(InterestComputationMethod2Code dayCountBasis) {
		this.dayCountBasis = dayCountBasis;
		return this;
	}

	public Optional<YesNoIndicator> getAppliedWithholdingTax() {
		return appliedWithholdingTax == null ? Optional.empty() : Optional.of(appliedWithholdingTax);
	}

	public InterestAmount1 setAppliedWithholdingTax(YesNoIndicator appliedWithholdingTax) {
		this.appliedWithholdingTax = appliedWithholdingTax;
		return this;
	}

	public Optional<CalculationMethod1Code> getCalculationMethod() {
		return calculationMethod == null ? Optional.empty() : Optional.of(calculationMethod);
	}

	public InterestAmount1 setCalculationMethod(CalculationMethod1Code calculationMethod) {
		this.calculationMethod = calculationMethod;
		return this;
	}

	public Optional<Frequency1Code> getCalculationFrequency() {
		return calculationFrequency == null ? Optional.empty() : Optional.of(calculationFrequency);
	}

	public InterestAmount1 setCalculationFrequency(Frequency1Code calculationFrequency) {
		this.calculationFrequency = calculationFrequency;
		return this;
	}

	public CollateralPurpose1Choice getCollateralPurpose() {
		return collateralPurpose;
	}

	public InterestAmount1 setCollateralPurpose(CollateralPurpose1Choice collateralPurpose) {
		this.collateralPurpose = Objects.requireNonNull(collateralPurpose);
		return this;
	}

	public Optional<CollateralBalance1> getOpeningCollateralBalance() {
		return openingCollateralBalance == null ? Optional.empty() : Optional.of(openingCollateralBalance);
	}

	public InterestAmount1 setOpeningCollateralBalance(CollateralBalance1 openingCollateralBalance) {
		this.openingCollateralBalance = openingCollateralBalance;
		return this;
	}

	public CollateralBalance1 getClosingCollateralBalance() {
		return closingCollateralBalance;
	}

	public InterestAmount1 setClosingCollateralBalance(CollateralBalance1 closingCollateralBalance) {
		this.closingCollateralBalance = Objects.requireNonNull(closingCollateralBalance);
		return this;
	}

	public Optional<Max140Text> getStandardSettlementInstructions() {
		return standardSettlementInstructions == null ? Optional.empty() : Optional.of(standardSettlementInstructions);
	}

	public InterestAmount1 setStandardSettlementInstructions(Max140Text standardSettlementInstructions) {
		this.standardSettlementInstructions = standardSettlementInstructions;
		return this;
	}

	public Optional<Max210Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public InterestAmount1 setAdditionalInformation(Max210Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public Optional<Reference20> getReferenceDetails() {
		return referenceDetails == null ? Optional.empty() : Optional.of(referenceDetails);
	}

	public InterestAmount1 setReferenceDetails(Reference20 referenceDetails) {
		this.referenceDetails = referenceDetails;
		return this;
	}
}