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

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.codeset.DebitCreditCode;
import com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Definition of exchanges of cash and/or securities available in the processing
 * of corporate actions.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="ProceedsDefinition" src="doc-files/ProceedsDefinition.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmSpecialConcessionAmount
 * ProceedsDefinition.mmSpecialConcessionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCreditDebitIndicator
 * ProceedsDefinition.mmCreditDebitIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmEarliestPaymentDate
 * ProceedsDefinition.mmEarliestPaymentDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmValueDate
 * ProceedsDefinition.mmValueDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmNonEligibleProceedsIndicator
 * ProceedsDefinition.mmNonEligibleProceedsIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmIssuerOfferorTaxabilityIndicator
 * ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOfferPriceFixingDate
 * ProceedsDefinition.mmOfferPriceFixingDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmOption
 * ProceedsDefinition.mmOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCorporateAction
 * ProceedsDefinition.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition#mmCountryOfIncomeSource
 * ProceedsDefinition.mmCountryOfIncomeSource}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmProceedsDefinition
 * CorporateActionEvent.mmProceedsDefinition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmProceedsDefinition
 * CorporateActionOption.mmProceedsDefinition}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSubType
 * subType} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition
 * SecuritiesProceedsDefinition}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashProceedsDefinition
 * CashProceedsDefinition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice
 * NonEligibleProceedsIndicator3Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ProceedsDefinition"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Definition of exchanges of cash and/or securities available in the processing of corporate actions."
 * </li>
 * </ul>
 */
public class ProceedsDefinition {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected CurrencyAndAmount specialConcessionAmount;
	/**
	 * Amount of drawdown or other reduction from or in addition to the deal
	 * price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts16#mmSpecialConcession
	 * OtherAmounts16.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAmounts1#mmSpecialConcessionAmount
	 * CorporateActionAmounts1.mmSpecialConcessionAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts28#mmSpecialConcession
	 * OtherAmounts28.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts30#mmSpecialConcession
	 * OtherAmounts30.mmSpecialConcession}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAmounts31#mmSpecialConcession
	 * OtherAmounts31.mmSpecialConcession}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpecialConcessionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of drawdown or other reduction from or in addition to the deal price."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmSpecialConcessionAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(OtherAmounts16.mmSpecialConcession, CorporateActionAmounts1.mmSpecialConcessionAmount, OtherAmounts28.mmSpecialConcession, OtherAmounts30.mmSpecialConcession,
					OtherAmounts31.mmSpecialConcession);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SpecialConcessionAmount";
			definition = "Amount of drawdown or other reduction from or in addition to the deal price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProceedsDefinition.class.getMethod("getSpecialConcessionAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected DebitCreditCode creditDebitIndicator;
	/**
	 * Specifies whether the value is a debit or credit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DebitCreditCode
	 * DebitCreditCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityOption1#mmCreditDebitIndicator
	 * SecurityOption1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption1#mmCreditDebitIndicator
	 * CashOption1.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption53#mmCreditDebitIndicator
	 * SecuritiesOption53.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption45#mmCreditDebitIndicator
	 * CashOption45.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmCreditDebitIndicator
	 * CashOption52.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmCreditDebitIndicator
	 * SecuritiesOption60.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmCreditDebitIndicator
	 * CashOption51.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmCreditDebitIndicator
	 * SecuritiesOption59.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmCreditDebitIndicator
	 * CashOption50.mmCreditDebitIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebitIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies whether the value is a debit or credit."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCreditDebitIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(SecurityOption1.mmCreditDebitIndicator, CashOption1.mmCreditDebitIndicator, SecuritiesOption53.mmCreditDebitIndicator, CashOption45.mmCreditDebitIndicator,
					CashOption52.mmCreditDebitIndicator, SecuritiesOption60.mmCreditDebitIndicator, CashOption51.mmCreditDebitIndicator, SecuritiesOption59.mmCreditDebitIndicator, CashOption50.mmCreditDebitIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CreditDebitIndicator";
			definition = "Specifies whether the value is a debit or credit.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DebitCreditCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProceedsDefinition.class.getMethod("getCreditDebitIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime earliestPaymentDate;
	/**
	 * Date on which a payment can be made, eg, if payment date is a
	 * non-business day or to indicate the first payment date of an offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#mmEarliestPaymentDate
	 * CorporateActionDate24.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmEarliestPaymentDate
	 * CorporateActionDate4.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate3#mmEarliestPaymentDate
	 * CorporateActionDate3.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate5#mmEarliestPaymentDate
	 * CorporateActionDate5.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate12#mmEarliestPaymentDate
	 * SecurityDate12.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate47#mmEarliestPaymentDate
	 * CorporateActionDate47.mmEarliestPaymentDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecurityDate11#mmEarliestPaymentDate
	 * SecurityDate11.mmEarliestPaymentDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarliestPaymentDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which a payment can be made, eg, if payment date is a non-business day or to indicate the first payment date of an offer."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmEarliestPaymentDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate24.mmEarliestPaymentDate, CorporateActionDate4.mmEarliestPaymentDate, CorporateActionDate3.mmEarliestPaymentDate, CorporateActionDate5.mmEarliestPaymentDate,
					SecurityDate12.mmEarliestPaymentDate, CorporateActionDate47.mmEarliestPaymentDate, SecurityDate11.mmEarliestPaymentDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "EarliestPaymentDate";
			definition = "Date on which a payment can be made, eg, if payment date is a non-business day or to indicate the first payment date of an offer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProceedsDefinition.class.getMethod("getEarliestPaymentDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime valueDate;
	/**
	 * Date/time at which assets become available to the account owner (in a
	 * credit entry), or cease to be available to the account owner (in a debit
	 * entry).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate24#mmValueDate
	 * CorporateActionDate24.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate5#mmValueDate
	 * CorporateActionDate5.mmValueDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate47#mmValueDate
	 * CorporateActionDate47.mmValueDate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashOption45#mmValueDate
	 * CashOption45.mmValueDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmValueDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate24.mmValueDate, CorporateActionDate5.mmValueDate, CorporateActionDate47.mmValueDate, CashOption45.mmValueDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ValueDate";
			definition = "Date/time at which assets become available to the account owner (in a credit entry), or cease to be available to the account owner (in a debit entry).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProceedsDefinition.class.getMethod("getValueDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected NonEligibleProceedsIndicatorCode nonEligibleProceedsIndicator;
	/**
	 * Specifies information regarding outturn resources that cannot be
	 * processed by the CSD. Special delivery instruction is required from the
	 * account owner for the CA outcome to be credited.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.NonEligibleProceedsIndicatorCode
	 * NonEligibleProceedsIndicatorCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice#mmCode
	 * NonEligibleProceedsIndicator3Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.NonEligibleProceedsIndicator3Choice#mmProprietary
	 * NonEligibleProceedsIndicator3Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmNonEligibleProceedsIndicator
	 * CashOption51.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmNonEligibleProceedsIndicator
	 * SecuritiesOption59.mmNonEligibleProceedsIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmNonEligibleProceedsIndicator
	 * CashOption50.mmNonEligibleProceedsIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonEligibleProceedsIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies information regarding outturn resources that cannot be processed by the CSD. Special delivery instruction is required from the account owner for the CA outcome to be credited."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmNonEligibleProceedsIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(NonEligibleProceedsIndicator3Choice.mmCode, NonEligibleProceedsIndicator3Choice.mmProprietary, CashOption51.mmNonEligibleProceedsIndicator,
					SecuritiesOption59.mmNonEligibleProceedsIndicator, CashOption50.mmNonEligibleProceedsIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NonEligibleProceedsIndicator";
			definition = "Specifies information regarding outturn resources that cannot be processed by the CSD. Special delivery instruction is required from the account owner for the CA outcome to be credited.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> NonEligibleProceedsIndicatorCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProceedsDefinition.class.getMethod("getNonEligibleProceedsIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Max35Text issuerOfferorTaxabilityIndicator;
	/**
	 * Proceeds are taxable according to the information provided by the issuer
	 * / offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmIssuerOfferorTaxabilityIndicator
	 * CashOption52.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption60.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption51#mmIssuerOfferorTaxabilityIndicator
	 * CashOption51.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmIssuerOfferorTaxabilityIndicator
	 * SecuritiesOption59.mmIssuerOfferorTaxabilityIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmIssuerOfferorTaxabilityIndicator
	 * CashOption50.mmIssuerOfferorTaxabilityIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerOfferorTaxabilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Proceeds are taxable according to the information provided by the issuer / offeror."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmIssuerOfferorTaxabilityIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashOption52.mmIssuerOfferorTaxabilityIndicator, SecuritiesOption60.mmIssuerOfferorTaxabilityIndicator, CashOption51.mmIssuerOfferorTaxabilityIndicator,
					SecuritiesOption59.mmIssuerOfferorTaxabilityIndicator, CashOption50.mmIssuerOfferorTaxabilityIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "IssuerOfferorTaxabilityIndicator";
			definition = "Proceeds are taxable according to the information provided by the issuer / offeror.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProceedsDefinition.class.getMethod("getIssuerOfferorTaxabilityIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ISODateTime offerPriceFixingDate;
	/**
	 * Date/time at which an offer price is determined (as compared to its reset
	 * date if applicable).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate44#mmFixingDate
	 * CorporateActionDate44.mmFixingDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferPriceFixingDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date/time at which an offer price is determined (as compared to its reset date if applicable)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmOfferPriceFixingDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionDate44.mmFixingDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OfferPriceFixingDate";
			definition = "Date/time at which an offer price is determined (as compared to its reset date if applicable).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProceedsDefinition.class.getMethod("getOfferPriceFixingDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionOption option;
	/**
	 * Option for which proceeds are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption#mmProceedsDefinition
	 * CorporateActionOption.mmProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOption
	 * CorporateActionOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Option"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Option for which proceeds are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOption = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Option";
			definition = "Option for which proceeds are specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmProceedsDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionOption.mmObject();
		}
	};
	protected CorporateActionEvent corporateAction;
	/**
	 * Corporate action for which the proceeds are specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmProceedsDefinition
	 * CorporateActionEvent.mmProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Corporate action for which the proceeds are specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCorporateAction = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CorporateAction";
			definition = "Corporate action for which the proceeds are specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmProceedsDefinition;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionEvent.mmObject();
		}
	};
	protected CountryCode countryOfIncomeSource;
	/**
	 * Indicates the country from which the income originates.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption52#mmCountryOfIncomeSource
	 * CashOption52.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption60#mmCountryOfIncomeSource
	 * SecuritiesOption60.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesOption59#mmCountryOfIncomeSource
	 * SecuritiesOption59.mmCountryOfIncomeSource}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashOption50#mmCountryOfIncomeSource
	 * CashOption50.mmCountryOfIncomeSource}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.ProceedsDefinition
	 * ProceedsDefinition}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfIncomeSource"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the country from which the income originates."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCountryOfIncomeSource = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(CashOption52.mmCountryOfIncomeSource, SecuritiesOption60.mmCountryOfIncomeSource, SecuritiesOption59.mmCountryOfIncomeSource, CashOption50.mmCountryOfIncomeSource);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.ProceedsDefinition.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CountryOfIncomeSource";
			definition = "Indicates the country from which the income originates.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ProceedsDefinition.class.getMethod("getCountryOfIncomeSource", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ProceedsDefinition";
				definition = "Definition of exchanges of cash and/or securities available in the processing of corporate actions.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CorporateActionEvent.mmProceedsDefinition, com.tools20022.repository.entity.CorporateActionOption.mmProceedsDefinition);
				subType_lazy = () -> Arrays.asList(SecuritiesProceedsDefinition.mmObject(), CashProceedsDefinition.mmObject());
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.ProceedsDefinition.mmSpecialConcessionAmount, com.tools20022.repository.entity.ProceedsDefinition.mmCreditDebitIndicator,
						com.tools20022.repository.entity.ProceedsDefinition.mmEarliestPaymentDate, com.tools20022.repository.entity.ProceedsDefinition.mmValueDate,
						com.tools20022.repository.entity.ProceedsDefinition.mmNonEligibleProceedsIndicator, com.tools20022.repository.entity.ProceedsDefinition.mmIssuerOfferorTaxabilityIndicator,
						com.tools20022.repository.entity.ProceedsDefinition.mmOfferPriceFixingDate, com.tools20022.repository.entity.ProceedsDefinition.mmOption, com.tools20022.repository.entity.ProceedsDefinition.mmCorporateAction,
						com.tools20022.repository.entity.ProceedsDefinition.mmCountryOfIncomeSource);
				derivationComponent_lazy = () -> Arrays.asList(NonEligibleProceedsIndicator3Choice.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return ProceedsDefinition.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CurrencyAndAmount getSpecialConcessionAmount() {
		return specialConcessionAmount;
	}

	public void setSpecialConcessionAmount(CurrencyAndAmount specialConcessionAmount) {
		this.specialConcessionAmount = specialConcessionAmount;
	}

	public DebitCreditCode getCreditDebitIndicator() {
		return creditDebitIndicator;
	}

	public void setCreditDebitIndicator(DebitCreditCode creditDebitIndicator) {
		this.creditDebitIndicator = creditDebitIndicator;
	}

	public ISODateTime getEarliestPaymentDate() {
		return earliestPaymentDate;
	}

	public void setEarliestPaymentDate(ISODateTime earliestPaymentDate) {
		this.earliestPaymentDate = earliestPaymentDate;
	}

	public ISODateTime getValueDate() {
		return valueDate;
	}

	public void setValueDate(ISODateTime valueDate) {
		this.valueDate = valueDate;
	}

	public NonEligibleProceedsIndicatorCode getNonEligibleProceedsIndicator() {
		return nonEligibleProceedsIndicator;
	}

	public void setNonEligibleProceedsIndicator(NonEligibleProceedsIndicatorCode nonEligibleProceedsIndicator) {
		this.nonEligibleProceedsIndicator = nonEligibleProceedsIndicator;
	}

	public Max35Text getIssuerOfferorTaxabilityIndicator() {
		return issuerOfferorTaxabilityIndicator;
	}

	public void setIssuerOfferorTaxabilityIndicator(Max35Text issuerOfferorTaxabilityIndicator) {
		this.issuerOfferorTaxabilityIndicator = issuerOfferorTaxabilityIndicator;
	}

	public ISODateTime getOfferPriceFixingDate() {
		return offerPriceFixingDate;
	}

	public void setOfferPriceFixingDate(ISODateTime offerPriceFixingDate) {
		this.offerPriceFixingDate = offerPriceFixingDate;
	}

	public CorporateActionOption getOption() {
		return option;
	}

	public void setOption(com.tools20022.repository.entity.CorporateActionOption option) {
		this.option = option;
	}

	public CorporateActionEvent getCorporateAction() {
		return corporateAction;
	}

	public void setCorporateAction(com.tools20022.repository.entity.CorporateActionEvent corporateAction) {
		this.corporateAction = corporateAction;
	}

	public CountryCode getCountryOfIncomeSource() {
		return countryOfIncomeSource;
	}

	public void setCountryOfIncomeSource(CountryCode countryOfIncomeSource) {
		this.countryOfIncomeSource = countryOfIncomeSource;
	}
}