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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the corporate action event type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#DividendReinvestment
 * CorporateActionEventTypeV6Code.mmDividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#CapitalGainsDistribution
 * CorporateActionEventTypeV6Code.mmCapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#CashDividend
 * CorporateActionEventTypeV6Code.mmCashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#DividendOption
 * CorporateActionEventTypeV6Code.mmDividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#StockDividend
 * CorporateActionEventTypeV6Code.mmStockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#LiquidationDividend
 * CorporateActionEventTypeV6Code.mmLiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Merger
 * CorporateActionEventTypeV6Code.mmMerger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#NameChange
 * CorporateActionEventTypeV6Code.mmNameChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#SpinOff
 * CorporateActionEventTypeV6Code.mmSpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Tender
 * CorporateActionEventTypeV6Code.mmTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#BonusIssue
 * CorporateActionEventTypeV6Code.mmBonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Change
 * CorporateActionEventTypeV6Code.mmChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Redenomination
 * CorporateActionEventTypeV6Code.mmRedenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#ExchangeOption
 * CorporateActionEventTypeV6Code.mmExchangeOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Exchange
 * CorporateActionEventTypeV6Code.mmExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#DecreaseInValue
 * CorporateActionEventTypeV6Code.mmDecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#EarlyRedemption
 * CorporateActionEventTypeV6Code.mmEarlyRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#FinalMaturity
 * CorporateActionEventTypeV6Code.mmFinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#InterestPayment
 * CorporateActionEventTypeV6Code.mmInterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Prefunding
 * CorporateActionEventTypeV6Code.mmPrefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Remarketing
 * CorporateActionEventTypeV6Code.mmRemarketing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Subscription
 * CorporateActionEventTypeV6Code.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Attachment
 * CorporateActionEventTypeV6Code.mmAttachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Conversion
 * CorporateActionEventTypeV6Code.mmConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Detachment
 * CorporateActionEventTypeV6Code.mmDetachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#ActiveTradingStatus
 * CorporateActionEventTypeV6Code.mmActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#AnnualGeneralMeeting
 * CorporateActionEventTypeV6Code.mmAnnualGeneralMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Bankruptcy
 * CorporateActionEventTypeV6Code.mmBankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#BondDefault
 * CorporateActionEventTypeV6Code.mmBondDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#CallOnIntermediateSecurities
 * CorporateActionEventTypeV6Code.mmCallOnIntermediateSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Capitalisation
 * CorporateActionEventTypeV6Code.mmCapitalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Consent
 * CorporateActionEventTypeV6Code.mmConsent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#CompanyOption
 * CorporateActionEventTypeV6Code.mmCompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#CouponStripping
 * CorporateActionEventTypeV6Code.mmCouponStripping}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#CourtMeeting
 * CorporateActionEventTypeV6Code.mmCourtMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Disclosure
 * CorporateActionEventTypeV6Code.mmDisclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Drawing
 * CorporateActionEventTypeV6Code.mmDrawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#DutchAuction
 * CorporateActionEventTypeV6Code.mmDutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#ExtraordinaryGeneralMeeting
 * CorporateActionEventTypeV6Code.mmExtraordinaryGeneralMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#FullCall
 * CorporateActionEventTypeV6Code.mmFullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#IncreaseInValue
 * CorporateActionEventTypeV6Code.mmIncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#InstalmentCall
 * CorporateActionEventTypeV6Code.mmInstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#InterestPaymentWithPrincipal
 * CorporateActionEventTypeV6Code.mmInterestPaymentWithPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#IntermediateSecuritiesDistribution
 * CorporateActionEventTypeV6Code.mmIntermediateSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#MaturityExtension
 * CorporateActionEventTypeV6Code.mmMaturityExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#NonUSTEFRADCertification
 * CorporateActionEventTypeV6Code.mmNonUSTEFRADCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#OddLotSalePurchase
 * CorporateActionEventTypeV6Code.mmOddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#OrdinaryGeneralMeeting
 * CorporateActionEventTypeV6Code.mmOrdinaryGeneralMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#OtherEvent
 * CorporateActionEventTypeV6Code.mmOtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#PariPassu
 * CorporateActionEventTypeV6Code.mmPariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#PartialRedemptionWithoutPoolFactorReduction
 * CorporateActionEventTypeV6Code.mmPartialRedemptionWithoutPoolFactorReduction}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#PartialRedemptionWithPoolFactorReduction
 * CorporateActionEventTypeV6Code.mmPartialRedemptionWithPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#PayInKind
 * CorporateActionEventTypeV6Code.mmPayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#PlaceOfIncorporation
 * CorporateActionEventTypeV6Code.mmPlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#PriorityIssue
 * CorporateActionEventTypeV6Code.mmPriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#PutRedemption
 * CorporateActionEventTypeV6Code.mmPutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#RemarketingAgreement
 * CorporateActionEventTypeV6Code.mmRemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#RepurchaseOffer
 * CorporateActionEventTypeV6Code.mmRepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#ReverseStockSplit
 * CorporateActionEventTypeV6Code.mmReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#RightsIssue
 * CorporateActionEventTypeV6Code.mmRightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#ScripDividend
 * CorporateActionEventTypeV6Code.mmScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#SharesPremiumDividend
 * CorporateActionEventTypeV6Code.mmSharesPremiumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#SmallestNegotiableUnit
 * CorporateActionEventTypeV6Code.mmSmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#StockSplit
 * CorporateActionEventTypeV6Code.mmStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#TaxReclaim
 * CorporateActionEventTypeV6Code.mmTaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#TradingStatusDelisted
 * CorporateActionEventTypeV6Code.mmTradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#TradingStatusSuspended
 * CorporateActionEventTypeV6Code.mmTradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#WarrantExercise
 * CorporateActionEventTypeV6Code.mmWarrantExercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#WithholdingTaxReliefCertification
 * CorporateActionEventTypeV6Code.mmWithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Worthless
 * CorporateActionEventTypeV6Code.mmWorthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#ClassActionProposedSettlement
 * CorporateActionEventTypeV6Code.mmClassActionProposedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#CapitalDistribution
 * CorporateActionEventTypeV6Code.mmCapitalDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#CreditEvent
 * CorporateActionEventTypeV6Code.mmCreditEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#SecuritiesHoldersMeeting
 * CorporateActionEventTypeV6Code.mmSecuritiesHoldersMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#CashDistributionFromNonEligibleSecuritiesSales
 * CorporateActionEventTypeV6Code.
 * mmCashDistributionFromNonEligibleSecuritiesSales}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Accumulation
 * CorporateActionEventTypeV6Code.mmAccumulation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#Information
 * CorporateActionEventTypeV6Code.mmInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code#NonOfficialOffer
 * CorporateActionEventTypeV6Code.mmNonOfficialOffer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
 * CorporateActionEventType22Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType20Code
 * CorporateActionEventType20Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType21Code
 * CorporateActionEventType21Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
 * CorporateActionEventType23Code}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType24Code
 * CorporateActionEventType24Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DRIP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventTypeV6Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the corporate action event type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventTypeV6Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Dividend payment where holders can keep cash or have the cash reinvested
	 * in the market by the issuer into additional shares in the issuing
	 * company. To be distinguished from DVOP as the company invests the
	 * dividend in the market rather than creating new share capital in exchange
	 * for the dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRIP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend payment where holders can keep cash or have the cash reinvested in the market by the issuer into additional shares in the issuing company. To be distinguished from DVOP as the company invests the dividend in the market rather than creating new share capital in exchange for the dividend."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code DividendReinvestment = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			definition = "Dividend payment where holders can keep cash or have the cash reinvested in the market by the issuer into additional shares in the issuing company. To be distinguished from DVOP as the company invests the dividend in the market rather than creating new share capital in exchange for the dividend.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DRIP";
		}
	};
	/**
	 * Event is the distribution of profits resulting from the sale of
	 * securities. Shareholders of mutual funds, unit trusts, or SICAVs are
	 * recipients of capital gains distributions and are often reinvested in
	 * additional shares of the fund.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainsDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or SICAVs are recipients of capital gains distributions and are often reinvested in additional shares of the fund."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code CapitalGainsDistribution = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainsDistribution";
			definition = "Event is the distribution of profits resulting from the sale of securities. Shareholders of mutual funds, unit trusts, or SICAVs are recipients of capital gains distributions and are often reinvested in additional shares of the fund.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "CAPG";
		}
	};
	/**
	 * Distribution of cash to shareholders, in proportion to their equity
	 * holding. Ordinary dividends are recurring and regular. Shareholder must
	 * take cash and may be offered a choice of currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code CashDividend = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			definition = "Distribution of cash to shareholders, in proportion to their equity holding. Ordinary dividends are recurring and regular. Shareholder must take cash and may be offered a choice of currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DVCA";
		}
	};
	/**
	 * Distribution of a dividend to shareholders with a choice of benefit to
	 * receive. Shareholders may choose to receive shares or cash. To be
	 * distinguished from DRIP as the company creates new share capital in
	 * exchange for the dividend rather than investing the dividend in the
	 * market.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of a dividend to shareholders with a choice of benefit to receive. Shareholders may choose to receive shares or cash. To be distinguished from DRIP as the company creates new share capital in exchange for the dividend rather than investing the dividend in the market."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code DividendOption = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			definition = "Distribution of a dividend to shareholders with a choice of benefit to receive. Shareholders may choose to receive shares or cash. To be distinguished from DRIP as the company creates new share capital in exchange for the dividend rather than investing the dividend in the market.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DVOP";
		}
	};
	/**
	 * Dividend paid to shareholders in the form of equities of the issuing
	 * corporation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend paid to shareholders in the form of equities of the issuing corporation."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code StockDividend = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			definition = "Dividend paid to shareholders in the form of equities of the issuing corporation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DVSE";
		}
	};
	/**
	 * Distribution of cash, assets or both. Debt may be paid in order of
	 * priority based on preferred claims to assets specified by the security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LIQU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code LiquidationDividend = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationDividend";
			definition = "Distribution of cash, assets or both. Debt may be paid in order of priority based on preferred claims to assets specified by the security.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "LIQU";
		}
	};
	/**
	 * Exchange of outstanding securities, initiated by the issuer which may
	 * include options, as the result of two or more companies combining assets,
	 * that is, an external, third party company. Cash payments may accompany
	 * share exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MRGR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Merger = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			definition = "Exchange of outstanding securities, initiated by the issuer which may include options, as the result of two or more companies combining assets, that is, an external, third party company. Cash payments may accompany share exchange.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "MRGR";
		}
	};
	/**
	 * Event is a name change. The issuing company changes its name. The event
	 * shows the change from old name to new name and may involve surrendering
	 * physical shares with the old name to the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NAME"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NameChange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is a name change. The issuing company changes its name. The event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code NameChange = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NameChange";
			definition = "Event is a name change. The issuing company changes its name. The event shows the change from old name to new name and may involve surrendering physical shares with the old name to the registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "NAME";
		}
	};
	/**
	 * Distribution of securities issued by another company. The distributed
	 * securities may either be of a newly created or of an existing company.
	 * For example, spin-off, demerger, unbundling, divestment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SOFF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of securities issued by another company. The distributed securities may either be of a newly created or of an existing company. For example, spin-off, demerger, unbundling, divestment."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code SpinOff = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			definition = "Distribution of securities issued by another company. The distributed securities may either be of a newly created or of an existing company. For example, spin-off, demerger, unbundling, divestment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "SOFF";
		}
	};
	/**
	 * Offer made to holders by a third party, requesting them to sell (tender)
	 * or exchange their securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TEND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Offer made to holders by a third party, requesting them to sell (tender) or exchange their securities."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Tender = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			definition = "Offer made to holders by a third party, requesting them to sell (tender) or exchange their securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "TEND";
		}
	};
	/**
	 * Bonus or capitalisation issue. Security holders receive additional assets
	 * free of payment from the issuer, in proportion to their holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BONU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bonus or capitalisation issue. Security holders receive additional assets free of payment from the issuer, in proportion to their holding."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code BonusIssue = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusIssue";
			definition = "Bonus or capitalisation issue. Security holders receive additional assets free of payment from the issuer, in proportion to their holding.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "BONU";
		}
	};
	/**
	 * Information regarding a change further described in the corporate action
	 * details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CHAN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information regarding a change further described in the corporate action details."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Change = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			definition = "Information regarding a change further described in the corporate action details.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "CHAN";
		}
	};
	/**
	 * Event by which the unit (currency and/or nominal) of a security is
	 * restated, for example, nominal/par value of security in a national
	 * currency is restated in another currency.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event by which the unit (currency and/or nominal) of a security is restated, for example, nominal/par value of security in a national currency is restated in another currency."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Redenomination = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			definition = "Event by which the unit (currency and/or nominal) of a security is restated, for example, nominal/par value of security in a national currency is restated in another currency.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "REDO";
		}
	};
	/**
	 * Event is an option for the shareholders to exchange their securities for
	 * other securities and/or cash. Exchange options are mentioned in the terms
	 * and conditions of a security and are valid during the whole lifetime of a
	 * security.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event is an option for the shareholders to exchange their securities for other securities and/or cash. Exchange options are mentioned in the terms and conditions of a security and are valid during the whole lifetime of a security."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code ExchangeOption = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeOption";
			definition = "Event is an option for the shareholders to exchange their securities for other securities and/or cash. Exchange options are mentioned in the terms and conditions of a security and are valid during the whole lifetime of a security.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "EXOP";
		}
	};
	/**
	 * Exchange of holdings for other securities and/or cash. The exchange can
	 * be either mandatory or voluntary involving the exchange of outstanding
	 * securities for different securities and/or cash. For example
	 * "exchange offer", "capital reorganisation" or "funds separation" .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example \"exchange offer\", \"capital reorganisation\" or \"funds separation\" ."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Exchange = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			definition = "Exchange of holdings for other securities and/or cash. The exchange can be either mandatory or voluntary involving the exchange of outstanding securities for different securities and/or cash. For example \"exchange offer\", \"capital reorganisation\" or \"funds separation\" .";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "EXOF";
		}
	};
	/**
	 * Reduction of face value of a single share or the value of fund assets.
	 * The number of circulating shares/units remains unchanged. This event may
	 * include a cash payout to holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DECR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseInValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reduction of face value of a single share or the value of fund assets. The number of circulating shares/units remains unchanged. This event may include a cash payout to holders."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code DecreaseInValue = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseInValue";
			definition = "Reduction of face value of a single share or the value of fund assets. The number of circulating shares/units remains unchanged. This event may include a cash payout to holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DECR";
		}
	};
	/**
	 * This includes drawing, partial and full call, put. Redemption in part or
	 * full before the scheduled final maturity date of a security, subject to
	 * the terms and conditions of the issue. Drawing - Securities are redeemed
	 * in part by lottery. Partial Call - Securities are redeemed in part by
	 * reducing proportionally the outstanding amount of securities. Put - Early
	 * redemption of a bond at the election of the bondholder. Full Call - The
	 * entire outstanding of a security is redeemed by the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EarlyRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "This includes drawing, partial and full call, put.\nRedemption in part or full before the scheduled final maturity date of a security, subject to the terms and conditions of the issue. \nDrawing - Securities are redeemed in part by lottery.\nPartial Call - Securities are redeemed in part by reducing proportionally the outstanding amount of securities.\nPut - Early redemption of a bond at the election of the bondholder.\nFull Call - The entire outstanding of a security is redeemed by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code EarlyRedemption = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EarlyRedemption";
			definition = "This includes drawing, partial and full call, put.\nRedemption in part or full before the scheduled final maturity date of a security, subject to the terms and conditions of the issue. \nDrawing - Securities are redeemed in part by lottery.\nPartial Call - Securities are redeemed in part by reducing proportionally the outstanding amount of securities.\nPut - Early redemption of a bond at the election of the bondholder.\nFull Call - The entire outstanding of a security is redeemed by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "ERED";
		}
	};
	/**
	 * Redemption of an entire issue outstanding of securities, eg, bonds,
	 * preferred equity, funds, by the issuer or its agent, for example, asset
	 * manager, at final maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REDM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, at final maturity."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code FinalMaturity = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalMaturity";
			definition = "Redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager, at final maturity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "REDM";
		}
	};
	/**
	 * Interest payment distributed to holders of an interest bearing asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest payment distributed to holders of an interest bearing asset."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code InterestPayment = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			definition = "Interest payment distributed to holders of an interest bearing asset.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "INTR";
		}
	};
	/**
	 * Also called partial defeasance. Issuer has money set aside to redeem a
	 * portion of an issue and the indenture states that the securities could be
	 * called earlier than the stated maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PDEF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prefunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Also called partial defeasance. Issuer has money set aside to redeem a portion of an issue and the indenture states that the securities could be called earlier than the stated maturity."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Prefunding = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefunding";
			definition = "Also called partial defeasance. Issuer has money set aside to redeem a portion of an issue and the indenture states that the securities could be called earlier than the stated maturity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "PDEF";
		}
	};
	/**
	 * Purchase and sale of remarketed preferred equities/bonds through the
	 * negotiation of interest rate between the issuers and the holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RMRK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Remarketing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Remarketing = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Remarketing";
			definition = "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "RMRK";
		}
	};
	/**
	 * Ability for security holders to purchase (additional or new) securities
	 * at a certain price, in proportion to their holding.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUBS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ability for security holders to purchase (additional or new) securities at a certain price, in proportion to their holding."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Subscription = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			definition = "Ability for security holders to purchase (additional or new) securities at a certain price, in proportion to their holding.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "SUBS";
		}
	};
	/**
	 * Combination of different security types to create a unit. Units are
	 * usually comprised of warrants and bonds or warrants and equities.
	 * Securities may be combined at the request of the security holder or based
	 * on market convention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ATTI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Combination of different security types to create a unit. Units are usually comprised of warrants and bonds or warrants and equities. Securities may be combined at the request of the security holder or based on market convention."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Attachment = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			definition = "Combination of different security types to create a unit. Units are usually comprised of warrants and bonds or warrants and equities. Securities may be combined at the request of the security holder or based on market convention.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "ATTI";
		}
	};
	/**
	 * Conversion of securities ( generally convertible bonds or preferred
	 * shares) into another form of securities ( usually common shares) at a
	 * pre-stated price/ratio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Conversion of securities ( generally convertible bonds or preferred shares) into another form of securities ( usually common shares) at a pre-stated price/ratio."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Conversion = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			definition = "Conversion of securities ( generally convertible bonds or preferred shares) into another form of securities ( usually common shares) at a pre-stated price/ratio.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "CONV";
		}
	};
	/**
	 * Separation of components that comprise a security, for example, usually
	 * units comprised of warrants and bond or warrants and equity . Units may
	 * be broken up at the request of the security holder or based on market
	 * convention.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DETI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Separation of components that comprise a security, for example, usually units comprised of warrants and bond or warrants and equity . Units may be broken up at the request of the security holder or based on market convention."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Detachment = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detachment";
			definition = "Separation of components that comprise a security, for example, usually units comprised of warrants and bond or warrants and equity . Units may be broken up at the request of the security holder or based on market convention.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DETI";
		}
	};
	/**
	 * Trading in security has commenced or security has been re-activated after
	 * a suspension in trading.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACTV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveTradingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trading in security has commenced or security has been re-activated after a suspension in trading."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code ActiveTradingStatus = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveTradingStatus";
			definition = "Trading in security has commenced or security has been re-activated after a suspension in trading.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "ACTV";
		}
	};
	/**
	 * Meeting Annual general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MEET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnualGeneralMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Meeting Annual general meeting."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code AnnualGeneralMeeting = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnualGeneralMeeting";
			definition = "Meeting Annual general meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "MEET";
		}
	};
	/**
	 * Legal status of a company unable to pay creditors. Bankruptcy usually
	 * involves a formal court ruling. Securities may become valueless.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BRUP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Legal status of a company unable to pay creditors. Bankruptcy usually involves a formal court ruling. Securities may become valueless."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Bankruptcy = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			definition = "Legal status of a company unable to pay creditors. Bankruptcy usually involves a formal court ruling. Securities may become valueless.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "BRUP";
		}
	};
	/**
	 * Failure by the company to perform obligations defined as default events
	 * under the bond agreement and that have not been remedied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DFLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Failure by the company to perform obligations defined as default events under the bond agreement and that have not been remedied."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code BondDefault = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondDefault";
			definition = "Failure by the company to perform obligations defined as default events under the bond agreement and that have not been remedied.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DFLT";
		}
	};
	/**
	 * Call or exercise on nil paid securities or intermediate securities
	 * resulting from an intermediate securities distribution (RHDI). This code
	 * is used for the second event, when an intermediate securities' issue
	 * (rights/coupons) is composed of two events, the first event being the
	 * distribution of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXRI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnIntermediateSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI). This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code CallOnIntermediateSecurities = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnIntermediateSecurities";
			definition = "Call or exercise on nil paid securities or intermediate securities resulting from an intermediate securities distribution (RHDI). This code is used for the second event, when an intermediate securities' issue (rights/coupons) is composed of two events, the first event being the distribution of intermediate securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "EXRI";
		}
	};
	/**
	 * Increase of the current principal of a debt instrument without increasing
	 * the nominal value. It normally arises from the incorporation of due but
	 * unpaid interest into the principal. This is commonly done by increasing
	 * the pool factor value, for example, capitalisation, and negative
	 * amortisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capitalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Increase of the current principal of a debt instrument without increasing the nominal value. It normally arises from the incorporation of due but unpaid interest into the principal. This is commonly done by increasing the pool factor value, for example, capitalisation, and negative amortisation."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Capitalisation = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capitalisation";
			definition = "Increase of the current principal of a debt instrument without increasing the nominal value. It normally arises from the incorporation of due but unpaid interest into the principal. This is commonly done by increasing the pool factor value, for example, capitalisation, and negative amortisation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "CAPI";
		}
	};
	/**
	 * Procedure that aims to obtain consent of holder to a proposal by the
	 * issuer or a third party without convening a meeting. For example, consent
	 * to change the terms of a bond.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CONS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Procedure that aims to obtain consent of holder  to a proposal by the issuer or a third party without convening a meeting. For example, consent to change the terms of a bond."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Consent = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			definition = "Procedure that aims to obtain consent of holder  to a proposal by the issuer or a third party without convening a meeting. For example, consent to change the terms of a bond.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "CONS";
		}
	};
	/**
	 * Company option may be granted by the company, allowing the holder to take
	 * up shares at some future date(s) at a pre arranged price in the company.
	 * A company may not grant options which enable the holder to take up
	 * unissued shares at a time which is five or more years from the date of
	 * the grant. Option holders are not members of a company. They are
	 * contingent creditors of a company and hence may, in some instances, be
	 * entitled to vote on and be bound by a scheme of arrangement between the
	 * creditors and the company. As many options have multiple exercise periods
	 * a company option will either lapse or carry on to the next expiry date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "COOP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Company option may be granted by the company, allowing the holder to take up shares at some future date(s) at a pre arranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code CompanyOption = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyOption";
			definition = "Company option may be granted by the company, allowing the holder to take up shares at some future date(s) at a pre arranged price in the company. A company may not grant options which enable the holder to take up unissued shares at a time which is five or more years from the date of the grant. Option holders are not members of a company. They are contingent creditors of a company and hence may, in some instances, be entitled to vote on and be bound by a scheme of arrangement between the creditors and the company. As many options have multiple exercise periods a company option will either lapse or carry on to the next expiry date.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "COOP";
		}
	};
	/**
	 * Coupon stripping is the process whereby interest coupons for future
	 * payment dates are separated from the security corpus that entitles the
	 * holder to the principal repayment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CPST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CouponStripping"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Coupon stripping is the process whereby interest coupons for future payment dates are separated from the security corpus that entitles the holder to the principal repayment."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code CouponStripping = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CouponStripping";
			definition = "Coupon stripping is the process whereby interest coupons for future payment dates are separated from the security corpus that entitles the holder to the principal repayment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "CPST";
		}
	};
	/**
	 * Announcement of a meeting at a Court.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CourtMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Announcement of a meeting at a Court."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code CourtMeeting = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CourtMeeting";
			definition = "Announcement of a meeting at a Court.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "CMET";
		}
	};
	/**
	 * Requirement for holders or beneficial owners to disclose their name,
	 * location and holdings of any issue to the issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DSCL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclosure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Disclosure = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclosure";
			definition = "Requirement for holders or beneficial owners to disclose their name, location and holdings of any issue to the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DSCL";
		}
	};
	/**
	 * Securities are redeemed in part before the scheduled final maturity date.
	 * It is done without any pool factor reduction. The redemption is reflected
	 * in a debit of the face amount (FAMT). Drawing is distinct from partial
	 * call since drawn bonds are chosen by lottery. Therefore, not every holder
	 * is affected in the same way.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRAW"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities are redeemed in part before the scheduled final maturity date. It is done without any pool factor reduction. The redemption is reflected in a debit of the face amount (FAMT). Drawing is distinct from partial call since drawn bonds are chosen by lottery. Therefore, not every holder is affected in the same way."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Drawing = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawing";
			definition = "Securities are redeemed in part before the scheduled final maturity date. It is done without any pool factor reduction. The redemption is reflected in a debit of the face amount (FAMT). Drawing is distinct from partial call since drawn bonds are chosen by lottery. Therefore, not every holder is affected in the same way.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DRAW";
		}
	};
	/**
	 * Action by a party wishing to acquire a security. Holders of the security
	 * are invited to make an offer to sell, within a specific price range. The
	 * acquiring party will buy from the holder with lowest offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DTCH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DutchAuction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code DutchAuction = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DutchAuction";
			definition = "Action by a party wishing to acquire a security. Holders of the security are invited to make an offer to sell, within a specific price range. The acquiring party will buy from the holder with lowest offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DTCH";
		}
	};
	/**
	 * Extraordinary or Special General Meeting. Extraordinary or special
	 * general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "XMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtraordinaryGeneralMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Extraordinary or Special General Meeting. Extraordinary or special general meeting."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code ExtraordinaryGeneralMeeting = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtraordinaryGeneralMeeting";
			definition = "Extraordinary or Special General Meeting. Extraordinary or special general meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "XMET";
		}
	};
	/**
	 * Redemption of an entire issue outstanding of securities, eg, bonds,
	 * preferred equity, funds, by the issuer or its agent, for example, asset
	 * manager,before final maturity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MCAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager,before final maturity."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code FullCall = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullCall";
			definition = "Redemption of an entire issue outstanding of securities, eg, bonds, preferred equity, funds, by the issuer or its agent, for example, asset manager,before final maturity.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "MCAL";
		}
	};
	/**
	 * Increase in the face value of a single security. The number of
	 * circulating securities remains unchanged .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INCR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseInValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Increase in the face value of a single security. The number of circulating securities remains unchanged ."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code IncreaseInValue = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseInValue";
			definition = "Increase in the face value of a single security. The number of circulating securities remains unchanged .";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "INCR";
		}
	};
	/**
	 * Instalment towards the purchase of equity capital, subject to an
	 * agreement between an issuer and a purchaser.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PPMT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code InstalmentCall = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentCall";
			definition = "Instalment towards the purchase of equity capital, subject to an agreement between an issuer and a purchaser.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "PPMT";
		}
	};
	/**
	 * Event which consists of two components, the decrease of the amortized
	 * value of a pool factor security and an interest payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRII"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentWithPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Event which consists of two components, the decrease of the amortized value of a pool factor security and an interest payment."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code InterestPaymentWithPrincipal = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentWithPrincipal";
			definition = "Event which consists of two components, the decrease of the amortized value of a pool factor security and an interest payment.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "PRII";
		}
	};
	/**
	 * Distribution of intermediate securities that gives the holder the right
	 * to take part in a future event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RHDI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution of intermediate securities that gives the holder the right to take part in a future event."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code IntermediateSecuritiesDistribution = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution";
			definition = "Distribution of intermediate securities that gives the holder the right to take part in a future event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "RHDI";
		}
	};
	/**
	 * As stipulated in the security's Terms and Conditions, the issuer or the
	 * holder may prolong the maturity date of a security. After extension, the
	 * security details may differ from the original issue. An issuer initiated
	 * extension may be subject to holder's approval.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXTM"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityExtension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "As stipulated in the security's Terms and Conditions, the issuer or the holder may prolong the maturity date of a security. After extension, the security details may differ from the original issue. An issuer initiated extension may be subject to holder's approval."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code MaturityExtension = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityExtension";
			definition = "As stipulated in the security's Terms and Conditions, the issuer or the holder may prolong the maturity date of a security. After extension, the security details may differ from the original issue. An issuer initiated extension may be subject to holder's approval.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "EXTM";
		}
	};
	/**
	 * Non-US beneficial owner certification requirement for exchange of
	 * temporary to permanent notes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CERT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonUSTEFRADCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Non-US beneficial owner certification requirement for exchange of temporary to permanent notes."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code NonUSTEFRADCertification = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUSTEFRADCertification";
			definition = "Non-US beneficial owner certification requirement for exchange of temporary to permanent notes.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "CERT";
		}
	};
	/**
	 * Sale or purchase of odd-lots to/from the issuing company, initiated
	 * either by the holder of the security or through an offer made by the
	 * issuer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ODLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotSalePurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sale or purchase of odd-lots to/from the issuing company, initiated either by the holder of the security or through an offer made by the issuer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code OddLotSalePurchase = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotSalePurchase";
			definition = "Sale or purchase of odd-lots to/from the issuing company, initiated either by the holder of the security or through an offer made by the issuer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "ODLT";
		}
	};
	/**
	 * Ordinary general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OMET"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrdinaryGeneralMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ordinary general meeting."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code OrdinaryGeneralMeeting = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrdinaryGeneralMeeting";
			definition = "Ordinary general meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "OMET";
		}
	};
	/**
	 * Other event, use only when no other event type applies, for example, a
	 * new event type.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OTHR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Other event, use only when no other event type applies, for example, a new event type."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code OtherEvent = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherEvent";
			definition = "Other event, use only when no other event type applies, for example, a new event type.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "OTHR";
		}
	};
	/**
	 * Occurs when securities with different characteristics, for example,
	 * shares with different entitlements to dividend or voting rights, become
	 * identical in all respects, for example , pari-passu or assimilation. May
	 * be scheduled in advance, for example, shares resulting from a bonus may
	 * become fungible after a pre-set period of time, or may result from
	 * outside events, for example, merger, reorganisation, issue of
	 * supplementary tranches.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PARI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Occurs when securities with different characteristics, for example, shares with different entitlements to dividend or voting rights, become identical in all respects, for example , pari-passu or assimilation. May be scheduled in advance, for example, shares resulting from a bonus may become fungible after a pre-set period of time, or may result from outside events, for example, merger, reorganisation, issue of supplementary tranches."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code PariPassu = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassu";
			definition = "Occurs when securities with different characteristics, for example, shares with different entitlements to dividend or voting rights, become identical in all respects, for example , pari-passu or assimilation. May be scheduled in advance, for example, shares resulting from a bonus may become fungible after a pre-set period of time, or may result from outside events, for example, merger, reorganisation, issue of supplementary tranches.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "PARI";
		}
	};
	/**
	 * Securities are redeemed in part before their scheduled final maturity
	 * date. It is done without any pool factor reduction. The redemption is
	 * reflected in a debit of the face amount (FAMT).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PCAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithoutPoolFactorReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities are redeemed in part before their scheduled final maturity date. It is done without any pool factor reduction. The redemption is reflected in a debit of the face amount (FAMT)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code PartialRedemptionWithoutPoolFactorReduction = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutPoolFactorReduction";
			definition = "Securities are redeemed in part before their scheduled final maturity date. It is done without any pool factor reduction. The redemption is reflected in a debit of the face amount (FAMT).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "PCAL";
		}
	};
	/**
	 * Securities are redeemed in part before their scheduled final maturity
	 * date. The redemption is reflected in a pool factor reduction. No movement
	 * of securities occurs.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRED"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithPoolFactorReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities are redeemed in part before their scheduled final maturity date. The redemption is reflected in a pool factor reduction. No movement of securities occurs."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code PartialRedemptionWithPoolFactorReduction = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithPoolFactorReduction";
			definition = "Securities are redeemed in part before their scheduled final maturity date. The redemption is reflected in a pool factor reduction. No movement of securities occurs.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "PRED";
		}
	};
	/**
	 * Interest payment, in any kind except cash, distributed to holders of an
	 * interest bearing asset.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PINK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInKind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Interest payment, in any kind except cash, distributed to holders of an interest bearing asset."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code PayInKind = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInKind";
			definition = "Interest payment, in any kind except cash, distributed to holders of an interest bearing asset.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "PINK";
		}
	};
	/**
	 * Changes in the state of incorporation for US companies and changes in the
	 * place of incorporation for foreign companies. Where shares need to be
	 * registered following the incorporation change, the holder(s) may have to
	 * elect the registrar.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PLAC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Changes in the state of incorporation for US companies and changes in the place of incorporation for foreign companies. Where shares need to be registered following the incorporation change, the holder(s) may have to elect the registrar."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code PlaceOfIncorporation = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIncorporation";
			definition = "Changes in the state of incorporation for US companies and changes in the place of incorporation for foreign companies. Where shares need to be registered following the incorporation change, the holder(s) may have to elect the registrar.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "PLAC";
		}
	};
	/**
	 * Form of open or public offer where, due to a limited amount of securities
	 * available, priority is given to existing shareholders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PRIO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Form of open or public offer where, due to a limited amount of securities available, priority is given to existing shareholders."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code PriorityIssue = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIssue";
			definition = "Form of open or public offer where, due to a limited amount of securities available, priority is given to existing shareholders.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "PRIO";
		}
	};
	/**
	 * Early redemption of a security at the election of the holder subject to
	 * the terms and condition of the issue with no reduction in nominal value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BPUT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Early redemption of a security at the election of the holder subject to the terms and condition of the issue with no reduction in nominal value."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code PutRedemption = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutRedemption";
			definition = "Early redemption of a security at the election of the holder subject to the terms and condition of the issue with no reduction in nominal value.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "BPUT";
		}
	};
	/**
	 * Purchase and sale of remarketed preferred equities/bonds through the
	 * negotiation of interest rate between the issuers and the holders.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "REMK"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemarketingAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code RemarketingAgreement = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemarketingAgreement";
			definition = "Purchase and sale of remarketed preferred equities/bonds through the negotiation of interest rate between the issuers and the holders.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "REMK";
		}
	};
	/**
	 * Repurchase offer/Issuer bid/ Reverse rights. Offer to existing holders by
	 * the issuing company to repurchase its own securities. The objective of
	 * the offer is to reduce the number of outstanding securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BIDS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Repurchase offer/Issuer bid/ Reverse rights. Offer to existing holders by the issuing company to repurchase its own securities. The objective of the offer is to reduce the number of outstanding securities."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code RepurchaseOffer = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseOffer";
			definition = "Repurchase offer/Issuer bid/ Reverse rights. Offer to existing holders by the issuing company to repurchase its own securities. The objective of the offer is to reduce the number of outstanding securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "BIDS";
		}
	};
	/**
	 * Decrease in a company's number of outstanding equities without any change
	 * in the shareholder's equity or the aggregate market value at the time of
	 * the split. Equity price and nominal value are increased accordingly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseStockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Decrease in a company's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are increased accordingly."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code ReverseStockSplit = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseStockSplit";
			definition = "Decrease in a company's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are increased accordingly.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "SPLR";
		}
	};
	/**
	 * Offer to holders of a security to subscribe for additional securities via
	 * the distribution of an intermediate security. Both processes are included
	 * in the same event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RHTS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Offer to holders of a security to subscribe for additional securities via the distribution of an intermediate security. Both processes are included in the same event."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code RightsIssue = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsIssue";
			definition = "Offer to holders of a security to subscribe for additional securities via the distribution of an intermediate security. Both processes are included in the same event.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "RHTS";
		}
	};
	/**
	 * Dividend or interest paid in the form of scrip.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DVSC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend or interest paid in the form of scrip."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code ScripDividend = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividend";
			definition = "Dividend or interest paid in the form of scrip.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DVSC";
		}
	};
	/**
	 * Corporate event pays shareholders an amount in cash issued from the
	 * shares premium reserve. It is similar to a dividend but with different
	 * tax implications.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SHPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesPremiumDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code SharesPremiumDividend = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesPremiumDividend";
			definition = "Corporate event pays shareholders an amount in cash issued from the shares premium reserve. It is similar to a dividend but with different tax implications.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "SHPR";
		}
	};
	/**
	 * Modification of the smallest negotiable unit of shares in order to obtain
	 * a new negotiable unit.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SMAL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallestNegotiableUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Modification of the smallest negotiable unit of shares in order to obtain a new negotiable unit."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code SmallestNegotiableUnit = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallestNegotiableUnit";
			definition = "Modification of the smallest negotiable unit of shares in order to obtain a new negotiable unit.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "SMAL";
		}
	};
	/**
	 * Increase in a corporation's number of outstanding equities without any
	 * change in the shareholder's equity or the aggregate market value at the
	 * time of the split. Equity price and nominal value are reduced
	 * accordingly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SPLF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code StockSplit = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			definition = "Increase in a corporation's number of outstanding equities without any change in the shareholder's equity or the aggregate market value at the time of the split. Equity price and nominal value are reduced accordingly.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "SPLF";
		}
	};
	/**
	 * Event related to tax reclaim activities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "TREC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Event related to tax reclaim activities."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code TaxReclaim = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			definition = "Event related to tax reclaim activities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "TREC";
		}
	};
	/**
	 * Security is no longer able to comply with the listing requirements of a
	 * stock exchange and is removed from official board quotation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLST"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusDelisted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code TradingStatusDelisted = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusDelisted";
			definition = "Security is no longer able to comply with the listing requirements of a stock exchange and is removed from official board quotation.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DLST";
		}
	};
	/**
	 * Trading in the security has been suspended.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SUSP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusSuspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trading in the security has been suspended."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code TradingStatusSuspended = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusSuspended";
			definition = "Trading in the security has been suspended.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "SUSP";
		}
	};
	/**
	 * Option offered to holders to buy (call warrant) or to sell (put warrant)
	 * a specific amount of stock, cash, or commodity, at a predetermined price,
	 * during a predetermined period of time (which usually corresponds to the
	 * life of the issue).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "EXWA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantExercise"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Option offered to holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code WarrantExercise = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantExercise";
			definition = "Option offered to holders to buy (call warrant) or to sell (put warrant) a specific amount of stock, cash, or commodity, at a predetermined price, during a predetermined period of time (which usually corresponds to the life of the issue).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "EXWA";
		}
	};
	/**
	 * Certification process for withholding tax reduction or exemption based on
	 * the tax status of the holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WTRC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxReliefCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Certification process for withholding tax reduction or exemption based on the tax status of the holder."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code WithholdingTaxReliefCertification = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxReliefCertification";
			definition = "Certification process for withholding tax reduction or exemption based on the tax status of the holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "WTRC";
		}
	};
	/**
	 * Booking out of valueless securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WRTH"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Worthless"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Booking out of valueless securities."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Worthless = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Worthless";
			definition = "Booking out of valueless securities.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "WRTH";
		}
	};
	/**
	 * Situation where interested parties seek restitution for financial loss.
	 * The security holder may be offered the opportunity to join a class action
	 * proceeding and would need to respond with an instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CLSA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionProposedSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Situation where interested parties seek restitution for financial loss. The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code ClassActionProposedSettlement = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionProposedSettlement";
			definition = "Situation where interested parties seek restitution for financial loss. The security holder may be offered the opportunity to join a class action proceeding and would need to respond with an instruction.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "CLSA";
		}
	};
	/**
	 * Corporate event pays shareholders an amount in cash issued from the
	 * capital account. There is no reduction to the face value of a single
	 * share (or the share has no par value). The number of circulating shares
	 * remains unchanged.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate event pays shareholders an amount in cash issued from the capital account. There is no reduction to the face value of a single share (or the share has no par value). The number of circulating shares remains unchanged."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code CapitalDistribution = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalDistribution";
			definition = "Corporate event pays shareholders an amount in cash issued from the capital account. There is no reduction to the face value of a single share (or the share has no par value). The number of circulating shares remains unchanged.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "CAPD";
		}
	};
	/**
	 * Occurrence of credit derivative for which the issuer of one or several
	 * underlying securities is unable to fulfill his financial obligations (as
	 * defined in terms and conditions).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CREV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill his financial obligations (as defined in terms and conditions)."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code CreditEvent = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEvent";
			definition = "Occurrence of credit derivative for which the issuer of one or several underlying securities is unable to fulfill his financial obligations (as defined in terms and conditions).";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "CREV";
		}
	};
	/**
	 * Ordinary or annual or extraordinary or special general meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MTNG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesHoldersMeeting"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Ordinary or annual or extraordinary or special general meeting."</li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code SecuritiesHoldersMeeting = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHoldersMeeting";
			definition = "Ordinary or annual or extraordinary or special general meeting.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "MTNG";
		}
	};
	/**
	 * Distribution to shareholders of cash resulting from the selling of
	 * non-eligible securities, for example, in the frame of a depositary
	 * receipt program.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DRCA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionFromNonEligibleSecuritiesSales"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Distribution to shareholders of cash resulting from the selling of non-eligible securities, for example, in the frame of a depositary receipt program."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code CashDistributionFromNonEligibleSecuritiesSales = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDistributionFromNonEligibleSecuritiesSales";
			definition = "Distribution to shareholders of cash resulting from the selling of non-eligible securities, for example, in the frame of a depositary receipt program.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "DRCA";
		}
	};
	/**
	 * Funds related event in which the income (for example accumulation units)
	 * that accrues during an accounting period is retained within the fund
	 * instead of being paid away to investors. The retained income is
	 * nonetheless deemed to have been distributed to investors for tax
	 * purposes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ACCU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accumulation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Funds related event in which the income (for example accumulation units) that accrues during an accounting period is retained within the fund instead of being paid away to investors. The retained income is nonetheless deemed to have been distributed to investors for tax purposes. "
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Accumulation = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accumulation";
			definition = "Funds related event in which the income (for example accumulation units) that accrues during an accounting period is retained within the fund instead of being paid away to investors. The retained income is nonetheless deemed to have been distributed to investors for tax purposes. ";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "ACCU";
		}
	};
	/**
	 * Information provided by the issuer having no accounting/financial impact
	 * on the holder.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "INFO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information provided by the issuer having no accounting/financial impact on the holder."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code Information = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			definition = "Information provided by the issuer having no accounting/financial impact on the holder.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "INFO";
		}
	};
	/**
	 * Offers that are not supervised or regulated by an official entity and
	 * being offered by a party, for example a broker, usually at a discount
	 * price, for example broker offer, mini-tender, mini odd lot offer or third
	 * party offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
	 * CorporateActionEventTypeV6Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonOfficialOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Offers that are not supervised or regulated by an official entity and being offered by a party, for example a broker, usually at a discount price, for example broker offer, mini-tender, mini odd lot offer or third party offer."
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventTypeV6Code NonOfficialOffer = new CorporateActionEventTypeV6Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonOfficialOffer";
			definition = "Offers that are not supervised or regulated by an official entity and being offered by a party, for example a broker, usually at a discount price, for example broker offer, mini-tender, mini odd lot offer or third party offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.mmObject();
			codeName = "NOOF";
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventTypeV6Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventTypeV6Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("DRIP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventTypeV6Code";
				definition = "Specifies the corporate action event type.";
				derivation_lazy = () -> Arrays.asList(CorporateActionEventType22Code.mmObject(), CorporateActionEventType20Code.mmObject(), CorporateActionEventType21Code.mmObject(), CorporateActionEventType23Code.mmObject(),
						CorporateActionEventType24Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.DividendReinvestment, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.CapitalGainsDistribution,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.CashDividend, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.DividendOption,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.StockDividend, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.LiquidationDividend,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Merger, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.NameChange,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.SpinOff, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Tender,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.BonusIssue, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Change,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Redenomination, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.ExchangeOption,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Exchange, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.DecreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.EarlyRedemption, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.FinalMaturity,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.InterestPayment, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Prefunding,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Remarketing, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Subscription,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Attachment, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Conversion,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Detachment, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.ActiveTradingStatus,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.AnnualGeneralMeeting, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Bankruptcy,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.BondDefault, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.CallOnIntermediateSecurities,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Capitalisation, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Consent,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.CompanyOption, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.CouponStripping,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.CourtMeeting, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Disclosure,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Drawing, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.DutchAuction,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.ExtraordinaryGeneralMeeting, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.FullCall,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.IncreaseInValue, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.InstalmentCall,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.InterestPaymentWithPrincipal, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.IntermediateSecuritiesDistribution,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.MaturityExtension, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.NonUSTEFRADCertification,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.OddLotSalePurchase, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.OrdinaryGeneralMeeting,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.OtherEvent, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.PariPassu,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.PartialRedemptionWithoutPoolFactorReduction,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.PartialRedemptionWithPoolFactorReduction, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.PayInKind,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.PlaceOfIncorporation, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.PriorityIssue,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.PutRedemption, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.RemarketingAgreement,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.RepurchaseOffer, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.ReverseStockSplit,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.RightsIssue, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.ScripDividend,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.SharesPremiumDividend, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.SmallestNegotiableUnit,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.StockSplit, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.TaxReclaim,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.TradingStatusDelisted, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.TradingStatusSuspended,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.WarrantExercise, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.WithholdingTaxReliefCertification,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Worthless, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.ClassActionProposedSettlement,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.CapitalDistribution, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.CreditEvent,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.SecuritiesHoldersMeeting, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.CashDistributionFromNonEligibleSecuritiesSales,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Accumulation, com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.Information,
						com.tools20022.repository.codeset.CorporateActionEventTypeV6Code.NonOfficialOffer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DividendReinvestment.getCodeName().get(), DividendReinvestment);
		codesByName.put(CapitalGainsDistribution.getCodeName().get(), CapitalGainsDistribution);
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(DividendOption.getCodeName().get(), DividendOption);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(LiquidationDividend.getCodeName().get(), LiquidationDividend);
		codesByName.put(Merger.getCodeName().get(), Merger);
		codesByName.put(NameChange.getCodeName().get(), NameChange);
		codesByName.put(SpinOff.getCodeName().get(), SpinOff);
		codesByName.put(Tender.getCodeName().get(), Tender);
		codesByName.put(BonusIssue.getCodeName().get(), BonusIssue);
		codesByName.put(Change.getCodeName().get(), Change);
		codesByName.put(Redenomination.getCodeName().get(), Redenomination);
		codesByName.put(ExchangeOption.getCodeName().get(), ExchangeOption);
		codesByName.put(Exchange.getCodeName().get(), Exchange);
		codesByName.put(DecreaseInValue.getCodeName().get(), DecreaseInValue);
		codesByName.put(EarlyRedemption.getCodeName().get(), EarlyRedemption);
		codesByName.put(FinalMaturity.getCodeName().get(), FinalMaturity);
		codesByName.put(InterestPayment.getCodeName().get(), InterestPayment);
		codesByName.put(Prefunding.getCodeName().get(), Prefunding);
		codesByName.put(Remarketing.getCodeName().get(), Remarketing);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(Attachment.getCodeName().get(), Attachment);
		codesByName.put(Conversion.getCodeName().get(), Conversion);
		codesByName.put(Detachment.getCodeName().get(), Detachment);
		codesByName.put(ActiveTradingStatus.getCodeName().get(), ActiveTradingStatus);
		codesByName.put(AnnualGeneralMeeting.getCodeName().get(), AnnualGeneralMeeting);
		codesByName.put(Bankruptcy.getCodeName().get(), Bankruptcy);
		codesByName.put(BondDefault.getCodeName().get(), BondDefault);
		codesByName.put(CallOnIntermediateSecurities.getCodeName().get(), CallOnIntermediateSecurities);
		codesByName.put(Capitalisation.getCodeName().get(), Capitalisation);
		codesByName.put(Consent.getCodeName().get(), Consent);
		codesByName.put(CompanyOption.getCodeName().get(), CompanyOption);
		codesByName.put(CouponStripping.getCodeName().get(), CouponStripping);
		codesByName.put(CourtMeeting.getCodeName().get(), CourtMeeting);
		codesByName.put(Disclosure.getCodeName().get(), Disclosure);
		codesByName.put(Drawing.getCodeName().get(), Drawing);
		codesByName.put(DutchAuction.getCodeName().get(), DutchAuction);
		codesByName.put(ExtraordinaryGeneralMeeting.getCodeName().get(), ExtraordinaryGeneralMeeting);
		codesByName.put(FullCall.getCodeName().get(), FullCall);
		codesByName.put(IncreaseInValue.getCodeName().get(), IncreaseInValue);
		codesByName.put(InstalmentCall.getCodeName().get(), InstalmentCall);
		codesByName.put(InterestPaymentWithPrincipal.getCodeName().get(), InterestPaymentWithPrincipal);
		codesByName.put(IntermediateSecuritiesDistribution.getCodeName().get(), IntermediateSecuritiesDistribution);
		codesByName.put(MaturityExtension.getCodeName().get(), MaturityExtension);
		codesByName.put(NonUSTEFRADCertification.getCodeName().get(), NonUSTEFRADCertification);
		codesByName.put(OddLotSalePurchase.getCodeName().get(), OddLotSalePurchase);
		codesByName.put(OrdinaryGeneralMeeting.getCodeName().get(), OrdinaryGeneralMeeting);
		codesByName.put(OtherEvent.getCodeName().get(), OtherEvent);
		codesByName.put(PariPassu.getCodeName().get(), PariPassu);
		codesByName.put(PartialRedemptionWithoutPoolFactorReduction.getCodeName().get(), PartialRedemptionWithoutPoolFactorReduction);
		codesByName.put(PartialRedemptionWithPoolFactorReduction.getCodeName().get(), PartialRedemptionWithPoolFactorReduction);
		codesByName.put(PayInKind.getCodeName().get(), PayInKind);
		codesByName.put(PlaceOfIncorporation.getCodeName().get(), PlaceOfIncorporation);
		codesByName.put(PriorityIssue.getCodeName().get(), PriorityIssue);
		codesByName.put(PutRedemption.getCodeName().get(), PutRedemption);
		codesByName.put(RemarketingAgreement.getCodeName().get(), RemarketingAgreement);
		codesByName.put(RepurchaseOffer.getCodeName().get(), RepurchaseOffer);
		codesByName.put(ReverseStockSplit.getCodeName().get(), ReverseStockSplit);
		codesByName.put(RightsIssue.getCodeName().get(), RightsIssue);
		codesByName.put(ScripDividend.getCodeName().get(), ScripDividend);
		codesByName.put(SharesPremiumDividend.getCodeName().get(), SharesPremiumDividend);
		codesByName.put(SmallestNegotiableUnit.getCodeName().get(), SmallestNegotiableUnit);
		codesByName.put(StockSplit.getCodeName().get(), StockSplit);
		codesByName.put(TaxReclaim.getCodeName().get(), TaxReclaim);
		codesByName.put(TradingStatusDelisted.getCodeName().get(), TradingStatusDelisted);
		codesByName.put(TradingStatusSuspended.getCodeName().get(), TradingStatusSuspended);
		codesByName.put(WarrantExercise.getCodeName().get(), WarrantExercise);
		codesByName.put(WithholdingTaxReliefCertification.getCodeName().get(), WithholdingTaxReliefCertification);
		codesByName.put(Worthless.getCodeName().get(), Worthless);
		codesByName.put(ClassActionProposedSettlement.getCodeName().get(), ClassActionProposedSettlement);
		codesByName.put(CapitalDistribution.getCodeName().get(), CapitalDistribution);
		codesByName.put(CreditEvent.getCodeName().get(), CreditEvent);
		codesByName.put(SecuritiesHoldersMeeting.getCodeName().get(), SecuritiesHoldersMeeting);
		codesByName.put(CashDistributionFromNonEligibleSecuritiesSales.getCodeName().get(), CashDistributionFromNonEligibleSecuritiesSales);
		codesByName.put(Accumulation.getCodeName().get(), Accumulation);
		codesByName.put(Information.getCodeName().get(), Information);
		codesByName.put(NonOfficialOffer.getCodeName().get(), NonOfficialOffer);
	}

	public static CorporateActionEventTypeV6Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventTypeV6Code[] values() {
		CorporateActionEventTypeV6Code[] values = new CorporateActionEventTypeV6Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventTypeV6Code> {
		@Override
		public CorporateActionEventTypeV6Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventTypeV6Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}