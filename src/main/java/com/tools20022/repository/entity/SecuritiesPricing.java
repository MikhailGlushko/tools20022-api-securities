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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.AmountPriceTypeCode;
import com.tools20022.repository.codeset.PriceMethodCode;
import com.tools20022.repository.codeset.PriceValueTypeCode;
import com.tools20022.repository.codeset.TypeOfPriceCode;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Characteristics related to the price of the security.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="SecuritiesPricing" src="doc-files/SecuritiesPricing.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceMethod
 * SecuritiesPricing.mmPriceMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
 * SecuritiesPricing.mmPriceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCumDividendIndicator
 * SecuritiesPricing.mmCumDividendIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCalculationBasis
 * SecuritiesPricing.mmCalculationBasis}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceChangeRelatedStatistics
 * SecuritiesPricing.mmPriceChangeRelatedStatistics}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRate
 * SecuritiesPricing.mmRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmHighestPriceValueRelatedStatistics
 * SecuritiesPricing.mmHighestPriceValueRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLowestPriceValueRelatedStatistics
 * SecuritiesPricing.mmLowestPriceValueRelatedStatistics}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecurity
 * SecuritiesPricing.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTradeExecution
 * SecuritiesPricing.mmSecuritiesTradeExecution}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYielded
 * SecuritiesPricing.mmYielded}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTypeOfRate
 * SecuritiesPricing.mmTypeOfRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDerivative
 * SecuritiesPricing.mmDerivative}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedWarrant
 * SecuritiesPricing.mmRelatedWarrant}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesConversion
 * SecuritiesPricing.mmRelatedSecuritiesConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLotBreakdown
 * SecuritiesPricing.mmLotBreakdown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTypeOfAmount
 * SecuritiesPricing.mmTypeOfAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmExercisePriceRelatedEvent
 * SecuritiesPricing.mmExercisePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPriceReceivedPerProductRelatedEvent
 * SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerFinancialInstrumentQuantity
 * SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerAmount
 * SecuritiesPricing.mmAmountPricePerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmGenericCashPricePaidPerProductRelatedEvent
 * SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceCalculationPeriod
 * SecuritiesPricing.mmPriceCalculationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashInLieuOfSharePriceRelatedEvent
 * SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOverSubscriptionDepositPriceRelatedEvent
 * SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashValueForTaxRelatedEvent
 * SecuritiesPricing.mmCashValueForTaxRelatedEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMaximumPriceBiddingConditions
 * SecuritiesPricing.mmMaximumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMinimumPriceBiddingConditions
 * SecuritiesPricing.mmMinimumPriceBiddingConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmQuotationDate
 * SecuritiesPricing.mmQuotationDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmYieldCalculation
 * SecuritiesPricing.mmYieldCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedSecuritiesFinancing
 * SecuritiesPricing.mmRelatedSecuritiesFinancing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToExecutedPrice
 * SecuritiesPricing.mmFundOrderRelatedToExecutedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmFundOrderRelatedToInformativePrice
 * SecuritiesPricing.mmFundOrderRelatedToInformativePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTaxVoucher
 * SecuritiesPricing.mmTaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSecuritiesTrade
 * SecuritiesPricing.mmSecuritiesTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmNetAssetValueCalculation
 * SecuritiesPricing.mmNetAssetValueCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedBuyIn
 * SecuritiesPricing.mmRelatedBuyIn}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIndex
 * SecuritiesPricing.mmIndex}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmInformationPartyRole
 * SecuritiesPricing.mmInformationPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceFactPeriod
 * SecuritiesPricing.mmPriceFactPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAnalyticsCalculation
 * SecuritiesPricing.mmAnalyticsCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDurationCalculation
 * SecuritiesPricing.mmDurationCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmLifeCalculation
 * SecuritiesPricing.mmLifeCalculation}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDate
 * SecuritiesPricing.mmDate}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSpread
 * SecuritiesPricing.mmSpread}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmOrder
 * SecuritiesPricing.mmOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmStopPriceOrder
 * SecuritiesPricing.mmStopPriceOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAllocation
 * SecuritiesPricing.mmAllocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedOrder
 * SecuritiesPricing.mmRelatedOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmIssuance
 * SecuritiesPricing.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmEntitlement
 * SecuritiesPricing.mmEntitlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCashFractionsPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.mmCashFractionsPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmSuscriptionPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.mmSuscriptionPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmReinvestmentPriceRelatedSecuritiesDistribution
 * SecuritiesPricing.mmReinvestmentPriceRelatedSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedFuture
 * SecuritiesPricing.mmRelatedFuture}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmDistribution
 * SecuritiesPricing.mmDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceChangeRedemptionSchedule
 * SecuritiesPricing.mmPriceChangeRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedRedemptionSchedule
 * SecuritiesPricing.mmRelatedRedemptionSchedule}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPreviousClosingPriceRelatedQuote
 * SecuritiesPricing.mmPreviousClosingPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRequestedPriceRelatedQuote
 * SecuritiesPricing.mmRequestedPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceRelatedQuote
 * SecuritiesPricing.mmPriceRelatedQuote}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmMarketPriceRelatedQuote
 * SecuritiesPricing.mmMarketPriceRelatedQuote}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
 * SecuritiesPricing.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedCorporateActionPrice
 * SecuritiesPricing.mmRelatedCorporateActionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRelatedPosition
 * SecuritiesPricing.mmRelatedPosition}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Security#mmPricing
 * Security.mmPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmPrice
 * InformationPartyRole.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmPrice
 * NetAssetValueCalculation.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPriceChange
 * RedemptionSchedule.mmPriceChange}</li>
 * <li>{@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPrice
 * RedemptionSchedule.mmPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceCalculationRelatedPricing
 * DateTimePeriod.mmPriceCalculationRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceFactRelatedPricing
 * DateTimePeriod.mmPriceFactRelatedPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
 * SecuritiesTrade.mmTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
 * InvestmentFundOrderExecution.mmInformativePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotPrice
 * LotBreakdown.mmLotPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Price#mmSecuritiesPricing
 * Price.mmSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPriceChange
 * ValuationStatistics.mmPriceChange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmHighestPriceValue
 * ValuationStatistics.mmHighestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmLowestPriceValue
 * ValuationStatistics.mmLowestPriceValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
 * SecuritiesTradeExecution.mmDealPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmTick
 * Derivative.mmTick}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Derivative#mmExercisePrice
 * Derivative.mmExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Issuance#mmOriginalIssueDiscount
 * Issuance.mmOriginalIssueDiscount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Index#mmSecuritiesPricing
 * Index.mmSecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Warrant#mmSubscriptionPrice
 * Warrant.mmSubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPrice
 * SecuritiesConversion.mmConversionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEndPrice
 * SecuritiesFinancing.mmEndPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumPrice
 * BiddingConditions.mmMaximumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumPrice
 * BiddingConditions.mmMinimumPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmScripDividendReinvestmentPricePerShare
 * TaxVoucher.mmScripDividendReinvestmentPricePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionExercisePrice
 * CorporateActionPrice.mmCorporateActionExercisePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashValueForTax
 * CorporateActionPrice.mmCashValueForTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmPricingCalculation
 * CorporateActionPrice.mmPricingCalculation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#mmSecuritiesPricing
 * AmountAndQuantity.mmSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AmountRatio#mmSecuritiesPricing
 * AmountRatio.mmSecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkPrice
 * Spread.mmBenchmarkPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
 * SecuritiesOrder.mmOrderPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStopPrice
 * SecuritiesOrder.mmStopPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmRedemptionPrice
 * YieldCalculation.mmRedemptionPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedPrice
 * Allocation.mmAllocatedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Distribution#mmOfferPrice
 * Distribution.mmOfferPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.BuyIn#mmBuyInPrice
 * BuyIn.mmBuyInPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPreviousClosingPrice
 * SecuritiesOrderParameters.mmPreviousClosingPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.Quote#mmPreviousClosingPrice
 * Quote.mmPreviousClosingPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmRequestedPrice
 * Quote.mmRequestedPrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmPrice Quote.mmPrice}
 * </li>
 * <li>{@linkplain com.tools20022.repository.entity.Quote#mmMarketPrice
 * Quote.mmMarketPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmCashFractionsPrice
 * SecuritiesDistribution.mmCashFractionsPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmSubscriptionPrice
 * SecuritiesDistribution.mmSubscriptionPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmReinvestmentPrice
 * SecuritiesDistribution.mmReinvestmentPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#mmSecuritiesPricing
 * AnalyticsCalculation.mmSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmRelatedSecuritiesPricing
 * DurationCalculation.mmRelatedSecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.LifeCalculation#mmSecuritiesPricing
 * LifeCalculation.mmSecuritiesPricing}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Entitlement#mmStrikePrice
 * Entitlement.mmStrikePrice}</li>
 * <li>{@linkplain com.tools20022.repository.entity.Position#mmPrice
 * Position.mmPrice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Price2#mmValue Price2.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType1Choice#mmMarket
 * PriceType1Choice.mmMarket}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceType1Choice#mmIndicative
 * PriceType1Choice.mmIndicative}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation2#mmValue
 * PriceInformation2.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceRate1#mmRateType
 * PriceRate1.mmRateType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation10#mmAmountOfChange
 * PriceInformation10.mmAmountOfChange}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation11#mmValue
 * PriceInformation11.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAggregateBalance1#mmPrice
 * FinancialInstrumentAggregateBalance1.mmPrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation12#mmValue
 * PriceInformation12.mmValue}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation13#mmValue
 * PriceInformation13.mmValue}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValue1 PriceValue1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15 UnitPrice15}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValue5 PriceValue5}</li>
 * <li>{@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice
 * YieldedOrValueType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice
 * PriceRateOrAmountChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price2 Price2}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceType1Choice
 * PriceType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PercentagePrice1
 * PercentagePrice1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice3 AmountPrice3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPricePerAmount2
 * AmountPricePerAmount2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice2 AmountPrice2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknownChoice
 * PriceRateOrAmountOrUnknownChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation2
 * PriceInformation2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price4 Price4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice10Choice
 * TypeOfPrice10Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AmountPriceType1FormatChoice
 * AmountPriceType1FormatChoice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice1 AmountPrice1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat3Choice
 * PriceFormat3Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat4Choice
 * PriceFormat4Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat2Choice
 * PriceFormat2Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1
 * AmountPricePerFinancialInstrumentQuantity1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AmountPricePerAmount1
 * AmountPricePerAmount1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat1Choice
 * PriceFormat1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice27Choice
 * TypeOfPrice27Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceAndDirection1
 * PriceAndDirection1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceValueAndRate4
 * PriceValueAndRate4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation10
 * PriceInformation10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation11
 * PriceInformation11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice20 UnitPrice20}</li>
 * <li>{@linkplain com.tools20022.repository.choice.UnitPriceType2Choice
 * UnitPriceType2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice19 UnitPrice19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Price6 Price6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice
 * SecuritiesTransactionPrice2Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice29Choice
 * TypeOfPrice29Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice30Choice
 * TypeOfPrice30Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation12
 * PriceInformation12}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice28Choice
 * TypeOfPrice28Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation13
 * PriceInformation13}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6
 * AmountPricePerFinancialInstrumentQuantity6}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice7Choice
 * IndicativeOrMarketPrice7Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat45Choice
 * PriceFormat45Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat50Choice
 * PriceFormat50Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.IndicativeOrMarketPrice8Choice
 * IndicativeOrMarketPrice8Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat48Choice
 * PriceFormat48Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat51Choice
 * PriceFormat51Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat46Choice
 * PriceFormat46Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails23 PriceDetails23}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat49Choice
 * PriceFormat49Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceDetails22 PriceDetails22}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat47Choice
 * PriceFormat47Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.PriceFormat44Choice
 * PriceFormat44Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21 UnitPrice21}</li>
 * <li>{@linkplain com.tools20022.repository.choice.TypeOfPrice31Choice
 * TypeOfPrice31Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22 UnitPrice22}</li>
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
 * "SecuritiesPricing"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Characteristics related to the price of the security."</li>
 * </ul>
 */
public class SecuritiesPricing {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected PriceMethodCode priceMethod;
	/**
	 * Type of pricing calculation method.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceMethodCode
	 * PriceMethodCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ValuationDealingProcessingCharacteristics2#mmPriceMethod
	 * ValuationDealingProcessingCharacteristics2.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmPriceMethod
	 * UnitPrice15.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice20#mmPriceMethod
	 * UnitPrice20.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21#mmPriceMethod
	 * UnitPrice21.mmPriceMethod}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22#mmPriceMethod
	 * UnitPrice22.mmPriceMethod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of pricing calculation method."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPriceMethod = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(ValuationDealingProcessingCharacteristics2.mmPriceMethod, UnitPrice15.mmPriceMethod, UnitPrice20.mmPriceMethod, UnitPrice21.mmPriceMethod, UnitPrice22.mmPriceMethod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceMethod";
			definition = "Type of pricing calculation method.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceMethodCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getPriceMethod", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected TypeOfPriceCode priceType;
	/**
	 * Type and information about a price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TypeOfPriceCode
	 * TypeOfPriceCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmType
	 * UnitPrice15.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice15#mmExtendedType
	 * UnitPrice15.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price2#mmType
	 * Price2.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation2#mmType
	 * PriceInformation2.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2#mmExtendedType
	 * PriceInformation2.mmExtendedType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price4#mmType
	 * Price4.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice10Choice#mmCode
	 * TypeOfPrice10Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice10Choice#mmProprietary
	 * TypeOfPrice10Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice27Choice#mmCode
	 * TypeOfPrice27Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice27Choice#mmProprietary
	 * TypeOfPrice27Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation10#mmType
	 * PriceInformation10.mmType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmTypeOfPrice
	 * Order17.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmTypeOfPrice
	 * Order18.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice20#mmPriceType
	 * UnitPrice20.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitPriceType2Choice#mmCode
	 * UnitPriceType2Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.UnitPriceType2Choice#mmProprietary
	 * UnitPriceType2Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice19#mmPriceType
	 * UnitPrice19.mmPriceType}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price6#mmType
	 * Price6.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails51#mmTypeOfPrice
	 * SecuritiesTradeDetails51.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails53#mmTypeOfPrice
	 * SecuritiesTradeDetails53.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails54#mmTypeOfPrice
	 * SecuritiesTradeDetails54.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown27#mmTypeOfPrice
	 * QuantityBreakdown27.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown30#mmTypeOfPrice
	 * QuantityBreakdown30.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown29#mmTypeOfPrice
	 * QuantityBreakdown29.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice29Choice#mmCode
	 * TypeOfPrice29Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice29Choice#mmProprietary
	 * TypeOfPrice29Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice30Choice#mmCode
	 * TypeOfPrice30Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice30Choice#mmProprietary
	 * TypeOfPrice30Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails52#mmTypeOfPrice
	 * SecuritiesTradeDetails52.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation12#mmType
	 * PriceInformation12.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.QuantityBreakdown28#mmTypeOfPrice
	 * QuantityBreakdown28.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice28Choice#mmCode
	 * TypeOfPrice28Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice28Choice#mmProprietary
	 * TypeOfPrice28Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation13#mmType
	 * PriceInformation13.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails50#mmTypeOfPrice
	 * SecuritiesTradeDetails50.mmTypeOfPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21#mmType
	 * UnitPrice21.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice31Choice#mmCode
	 * TypeOfPrice31Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice31Choice#mmProprietary
	 * TypeOfPrice31Choice.mmProprietary}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22#mmType
	 * UnitPrice22.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice46Choice#mmCode
	 * TypeOfPrice46Choice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice46Choice#mmProprietary
	 * TypeOfPrice46Choice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.DerivativeCommodity2#mmFinalPriceType
	 * DerivativeCommodity2.mmFinalPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails67#mmTypeOfPrice
	 * SecuritiesTradeDetails67.mmTypeOfPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails68#mmTypeOfPrice
	 * SecuritiesTradeDetails68.mmTypeOfPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type and information about a price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmPriceType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice15.mmType, UnitPrice15.mmExtendedType, Price2.mmType, PriceInformation2.mmType, PriceInformation2.mmExtendedType, Price4.mmType, TypeOfPrice10Choice.mmCode,
					TypeOfPrice10Choice.mmProprietary, TypeOfPrice27Choice.mmCode, TypeOfPrice27Choice.mmProprietary, PriceInformation10.mmType, Order17.mmTypeOfPrice, Order18.mmTypeOfPrice, UnitPrice20.mmPriceType,
					UnitPriceType2Choice.mmCode, UnitPriceType2Choice.mmProprietary, UnitPrice19.mmPriceType, Price6.mmType, SecuritiesTradeDetails51.mmTypeOfPrice, SecuritiesTradeDetails53.mmTypeOfPrice,
					SecuritiesTradeDetails54.mmTypeOfPrice, QuantityBreakdown27.mmTypeOfPrice, QuantityBreakdown30.mmTypeOfPrice, QuantityBreakdown29.mmTypeOfPrice, TypeOfPrice29Choice.mmCode, TypeOfPrice29Choice.mmProprietary,
					TypeOfPrice30Choice.mmCode, TypeOfPrice30Choice.mmProprietary, SecuritiesTradeDetails52.mmTypeOfPrice, PriceInformation12.mmType, QuantityBreakdown28.mmTypeOfPrice, TypeOfPrice28Choice.mmCode,
					TypeOfPrice28Choice.mmProprietary, PriceInformation13.mmType, SecuritiesTradeDetails50.mmTypeOfPrice, UnitPrice21.mmType, TypeOfPrice31Choice.mmCode, TypeOfPrice31Choice.mmProprietary, UnitPrice22.mmType,
					TypeOfPrice46Choice.mmCode, TypeOfPrice46Choice.mmProprietary, DerivativeCommodity2.mmFinalPriceType, SecuritiesTradeDetails67.mmTypeOfPrice, SecuritiesTradeDetails68.mmTypeOfPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceType";
			definition = "Type and information about a price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TypeOfPriceCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getPriceType", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected YesNoIndicator cumDividendIndicator;
	/**
	 * Indicates whether the dividend is included, ie, cum-dividend, in the
	 * executed price. When the dividend is not included, the price will be
	 * ex-dividend.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmCumDividendIndicator
	 * UnitPrice15.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmCumDividendIndicator
	 * InvestmentFundTransaction4.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution13#mmCumDividendIndicator
	 * SubscriptionExecution13.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionExecution12#mmCumDividendIndicator
	 * SubscriptionExecution12.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution16#mmCumDividendIndicator
	 * RedemptionExecution16.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchSubscriptionLegExecution4#mmCumDividendIndicator
	 * SwitchSubscriptionLegExecution4.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RedemptionExecution15#mmCumDividendIndicator
	 * RedemptionExecution15.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SwitchRedemptionLegExecution4#mmCumDividendIndicator
	 * SwitchRedemptionLegExecution4.mmCumDividendIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividendIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCumDividendIndicator = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice15.mmCumDividendIndicator, InvestmentFundTransaction4.mmCumDividendIndicator, SubscriptionExecution13.mmCumDividendIndicator, SubscriptionExecution12.mmCumDividendIndicator,
					RedemptionExecution16.mmCumDividendIndicator, SwitchSubscriptionLegExecution4.mmCumDividendIndicator, RedemptionExecution15.mmCumDividendIndicator, SwitchRedemptionLegExecution4.mmCumDividendIndicator);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CumDividendIndicator";
			definition = "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getCumDividendIndicator", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PercentageRate calculationBasis;
	/**
	 * Ratio applied on the non-adjusted price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmCalculationBasis
	 * UnitPrice15.mmCalculationBasis}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationBasis"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio applied on the non-adjusted price."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmCalculationBasis = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice15.mmCalculationBasis);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationBasis";
			definition = "Ratio applied on the non-adjusted price.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getCalculationBasis", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.ValuationStatistics> priceChangeRelatedStatistics;
	/**
	 * Valuation statistics for which a change of price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmPriceChange
	 * ValuationStatistics.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChangeRelatedStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a change of price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceChangeRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceChangeRelatedStatistics";
			definition = "Valuation statistics for which a change of price is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmPriceChange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
		}
	};
	protected PercentageRate rate;
	/**
	 * Price expressed as a rate, ie, percentage.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValueChange1#mmRate
	 * PriceValueChange1.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice#mmRate
	 * PriceRateOrAmountChoice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PercentagePrice1#mmPriceValue
	 * PercentagePrice1.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknownChoice#mmRate
	 * PriceRateOrAmountOrUnknownChoice.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceRate1#mmRate
	 * PriceRate1.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat3Choice#mmRate
	 * PriceFormat3Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat4Choice#mmRate
	 * PriceFormat4Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat2Choice#mmRate
	 * PriceFormat2Choice.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat1Choice#mmRate
	 * PriceFormat1Choice.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValueAndRate4#mmRate
	 * PriceValueAndRate4.mmRate}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Price6#mmRateOrAmount
	 * Price6.mmRateOrAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#mmPercentage
	 * SecuritiesTransactionPrice2Choice.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat45Choice#mmPercentagePrice
	 * PriceFormat45Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat50Choice#mmPercentagePrice
	 * PriceFormat50Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmPercentagePrice
	 * PriceFormat48Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat51Choice#mmPercentagePrice
	 * PriceFormat51Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#mmPercentagePrice
	 * PriceFormat49Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#mmPercentagePrice
	 * PriceFormat47Choice.mmPercentagePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat44Choice#mmPercentagePrice
	 * PriceFormat44Choice.mmPercentagePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a rate, ie, percentage."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PriceValueChange1.mmRate, PriceRateOrAmountChoice.mmRate, PercentagePrice1.mmPriceValue, PriceRateOrAmountOrUnknownChoice.mmRate, PriceRate1.mmRate, PriceFormat3Choice.mmRate,
					PriceFormat4Choice.mmRate, PriceFormat2Choice.mmRate, PriceFormat1Choice.mmRate, PriceValueAndRate4.mmRate, Price6.mmRateOrAmount, SecuritiesTransactionPrice2Choice.mmPercentage, PriceFormat45Choice.mmPercentagePrice,
					PriceFormat50Choice.mmPercentagePrice, PriceFormat48Choice.mmPercentagePrice, PriceFormat51Choice.mmPercentagePrice, PriceFormat49Choice.mmPercentagePrice, PriceFormat47Choice.mmPercentagePrice,
					PriceFormat44Choice.mmPercentagePrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Rate";
			definition = "Price expressed as a rate, ie, percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected ValuationStatistics highestPriceValueRelatedStatistics;
	/**
	 * Valuation statistics for which a highest price value is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmHighestPriceValue
	 * ValuationStatistics.mmHighestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HighestPriceValueRelatedStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a highest price value is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmHighestPriceValueRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "HighestPriceValueRelatedStatistics";
			definition = "Valuation statistics for which a highest price value is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmHighestPriceValue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
		}
	};
	protected ValuationStatistics lowestPriceValueRelatedStatistics;
	/**
	 * Valuation statistics for which a lowest price value is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.ValuationStatistics#mmLowestPriceValue
	 * ValuationStatistics.mmLowestPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.ValuationStatistics
	 * ValuationStatistics}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LowestPriceValueRelatedStatistics"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Valuation statistics for which a lowest price value is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLowestPriceValueRelatedStatistics = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LowestPriceValueRelatedStatistics";
			definition = "Valuation statistics for which a lowest price value is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmLowestPriceValue;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.ValuationStatistics.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Security> security;
	/**
	 * Identifies the security for which a price is given.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmPricing
	 * Security.mmPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Security Security}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the security for which a price is given."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecurity = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Security";
			definition = "Identifies the security for which a price is given.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Security.mmPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Security.mmObject();
		}
	};
	protected SecuritiesTradeExecution securitiesTradeExecution;
	/**
	 * Trade execution for which a deal price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmDealPrice
	 * SecuritiesTradeExecution.mmDealPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution
	 * SecuritiesTradeExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTradeExecution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade execution for which a deal price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTradeExecution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTradeExecution";
			definition = "Trade execution for which a deal price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmDealPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTradeExecution.mmObject();
		}
	};
	protected YesNoIndicator yielded;
	/**
	 * Indicates whether the price is expressed as a yield (yield is the annual
	 * rate of return expressed as a percentage).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice#mmYielded
	 * YieldedOrValueType1Choice.mmYielded}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2#mmYielded
	 * PriceInformation2.mmYielded}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yielded"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the price is expressed as a yield (yield is the annual rate of return expressed as a percentage)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmYielded = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(YieldedOrValueType1Choice.mmYielded, PriceInformation2.mmYielded);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Yielded";
			definition = "Indicates whether the price is expressed as a yield (yield is the annual rate of return expressed as a percentage).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getYielded", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PriceValueTypeCode typeOfRate;
	/**
	 * Type of value in which the price (as a rate) is expressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueTypeCode
	 * PriceValueTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice#mmValueType
	 * YieldedOrValueType1Choice.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PercentagePrice1#mmPercentagePriceType
	 * PercentagePrice1.mmPercentagePriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2#mmValueType
	 * PriceInformation2.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation12#mmValueType
	 * PriceInformation12.mmValueType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#mmValueType
	 * PriceInformation13.mmValueType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of value in which the price (as a rate)  is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTypeOfRate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(YieldedOrValueType1Choice.mmValueType, PercentagePrice1.mmPercentagePriceType, PriceInformation2.mmValueType, PriceInformation12.mmValueType, PriceInformation13.mmValueType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfRate";
			definition = "Type of value in which the price (as a rate)  is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceValueTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getTypeOfRate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.Derivative> derivative;
	/**
	 * Derivative for which an exercise price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmExercisePrice
	 * Derivative.mmExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Derivative
	 * Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Derivative"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Derivative for which an exercise price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDerivative = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Derivative";
			definition = "Derivative for which an exercise price is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.mmExercisePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Warrant> relatedWarrant;
	/**
	 * Warrant for which a subscription price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Warrant#mmSubscriptionPrice
	 * Warrant.mmSubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Warrant Warrant}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedWarrant"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Warrant for which a subscription price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedWarrant = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedWarrant";
			definition = "Warrant for which a subscription price is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Warrant.mmSubscriptionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Warrant.mmObject();
		}
	};
	protected SecuritiesConversion relatedSecuritiesConversion;
	/**
	 * Securities conversion process for which a conversion price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion#mmConversionPrice
	 * SecuritiesConversion.mmConversionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesConversion
	 * SecuritiesConversion}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities conversion process for which a conversion price is specified."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesConversion = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesConversion";
			definition = "Securities conversion process for which a conversion price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmConversionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesConversion.mmObject();
		}
	};
	protected LotBreakdown lotBreakdown;
	/**
	 * Lot for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LotBreakdown#mmLotPrice
	 * LotBreakdown.mmLotPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LotBreakdown
	 * LotBreakdown}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotBreakdown"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Lot for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLotBreakdown = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LotBreakdown";
			definition = "Lot for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmLotPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LotBreakdown.mmObject();
		}
	};
	protected AmountPriceTypeCode typeOfAmount;
	/**
	 * Type of value in which the price (as a rate) is expressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AmountPriceTypeCode
	 * AmountPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice3#mmAmountPriceType
	 * AmountPrice3.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount2#mmAmountPriceType
	 * AmountPricePerAmount2.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice2#mmAmountPriceType
	 * AmountPrice2.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountPriceType1FormatChoice#mmCode
	 * AmountPriceType1FormatChoice.mmCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.AmountPriceType1FormatChoice#mmProprietary
	 * AmountPriceType1FormatChoice.mmProprietary}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPrice1#mmAmountPriceType
	 * AmountPrice1.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1#mmAmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity1.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1#mmAmountPriceType
	 * AmountPricePerAmount1.mmAmountPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#mmAmountPriceType
	 * AmountPricePerFinancialInstrumentQuantity6.mmAmountPriceType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeOfAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of value in which the price (as a rate)  is expressed."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmTypeOfAmount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(AmountPrice3.mmAmountPriceType, AmountPricePerAmount2.mmAmountPriceType, AmountPrice2.mmAmountPriceType, AmountPriceType1FormatChoice.mmCode, AmountPriceType1FormatChoice.mmProprietary,
					AmountPrice1.mmAmountPriceType, AmountPricePerFinancialInstrumentQuantity1.mmAmountPriceType, AmountPricePerAmount1.mmAmountPriceType, AmountPricePerFinancialInstrumentQuantity6.mmAmountPriceType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TypeOfAmount";
			definition = "Type of value in which the price (as a rate)  is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AmountPriceTypeCode.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getTypeOfAmount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CorporateActionPrice exercisePriceRelatedEvent;
	/**
	 * Corporate action event for which an exercise price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCorporateActionExercisePrice
	 * CorporateActionPrice.mmCorporateActionExercisePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExercisePriceRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which an exercise price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmExercisePriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ExercisePriceRelatedEvent";
			definition = "Corporate action event for which an exercise price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionExercisePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected CorporateActionPrice genericCashPriceReceivedPerProductRelatedEvent;
	/**
	 * Corporate action event for which a generic cash price received per
	 * product is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPriceReceivedPerProduct
	 * CorporateActionPrice.mmGenericCashPriceReceivedPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPriceReceivedPerProductRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a generic cash price received per product is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGenericCashPriceReceivedPerProductRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericCashPriceReceivedPerProductRelatedEvent";
			definition = "Corporate action event for which a generic cash price received per product is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPriceReceivedPerProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected AmountAndQuantity amountPricePerFinancialInstrumentQuantity;
	/**
	 * Price expressed as an amount per a quantity of financial instruments.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity#mmSecuritiesPricing
	 * AmountAndQuantity.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat1Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat1Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat48Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat49Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#mmAmountPricePerFinancialInstrumentQuantity
	 * PriceFormat47Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerFinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as an amount per a quantity of financial instruments."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAmountPricePerFinancialInstrumentQuantity = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(PriceFormat1Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat48Choice.mmAmountPricePerFinancialInstrumentQuantity,
					PriceFormat49Choice.mmAmountPricePerFinancialInstrumentQuantity, PriceFormat47Choice.mmAmountPricePerFinancialInstrumentQuantity);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountPricePerFinancialInstrumentQuantity";
			definition = "Price expressed as an amount per a quantity of financial instruments.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountAndQuantity.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AmountAndQuantity.mmObject();
		}
	};
	protected AmountRatio amountPricePerAmount;
	/**
	 * Price expressed as an amount per another amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio#mmSecuritiesPricing
	 * AmountRatio.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.AmountRatio
	 * AmountRatio}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount2#mmAmount
	 * AmountPricePerAmount2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1#mmAmount
	 * AmountPricePerAmount1.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat1Choice#mmAmountPricePerAmount
	 * PriceFormat1Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat48Choice#mmAmountPricePerAmount
	 * PriceFormat48Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat49Choice#mmAmountPricePerAmount
	 * PriceFormat49Choice.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceFormat47Choice#mmAmountPricePerAmount
	 * PriceFormat47Choice.mmAmountPricePerAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as an amount per another amount."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAmountPricePerAmount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(AmountPricePerAmount2.mmAmount, AmountPricePerAmount1.mmAmount, PriceFormat1Choice.mmAmountPricePerAmount, PriceFormat48Choice.mmAmountPricePerAmount,
					PriceFormat49Choice.mmAmountPricePerAmount, PriceFormat47Choice.mmAmountPricePerAmount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AmountPricePerAmount";
			definition = "Price expressed as an amount per another amount.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.AmountRatio.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AmountRatio.mmObject();
		}
	};
	protected CorporateActionPrice genericCashPricePaidPerProductRelatedEvent;
	/**
	 * Corporate action event for which a generic cash price paid per product is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmGenericCashPricePaidPerProduct
	 * CorporateActionPrice.mmGenericCashPricePaidPerProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GenericCashPricePaidPerProductRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a generic cash price paid per product is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmGenericCashPricePaidPerProductRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "GenericCashPricePaidPerProductRelatedEvent";
			definition = "Corporate action event for which a generic cash price paid per product is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPricePaidPerProduct;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected DateTimePeriod priceCalculationPeriod;
	/**
	 * Period during which the price of a security is determined (For outturn
	 * securities).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceCalculationRelatedPricing
	 * DateTimePeriod.mmPriceCalculationRelatedPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod7#mmPriceCalculationPeriod
	 * CorporateActionPeriod7.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod1#mmPriceCalculationPeriod
	 * CorporateActionPeriod1.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod2#mmPriceCalculationPeriod
	 * CorporateActionPeriod2.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod10#mmPriceCalculationPeriod
	 * CorporateActionPeriod10.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11#mmPriceCalculationPeriod
	 * PriceInformation11.mmPriceCalculationPeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPeriod11#mmPriceCalculationPeriod
	 * CorporateActionPeriod11.mmPriceCalculationPeriod}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceCalculationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Period during which the price of a security is determined (For outturn securities)."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceCalculationPeriod = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(CorporateActionPeriod7.mmPriceCalculationPeriod, CorporateActionPeriod1.mmPriceCalculationPeriod, CorporateActionPeriod2.mmPriceCalculationPeriod,
					CorporateActionPeriod10.mmPriceCalculationPeriod, PriceInformation11.mmPriceCalculationPeriod, CorporateActionPeriod11.mmPriceCalculationPeriod);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceCalculationPeriod";
			definition = "Period during which the price of a security is determined (For outturn securities).";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmPriceCalculationRelatedPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected CorporateActionPrice cashInLieuOfSharePriceRelatedEvent;
	/**
	 * Corporate action event for which a cash in lieu of share price is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashInLieuOfSharePrice
	 * CorporateActionPrice.mmCashInLieuOfSharePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashInLieuOfSharePriceRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a cash in lieu of share price is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashInLieuOfSharePriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashInLieuOfSharePriceRelatedEvent";
			definition = "Corporate action event for which a cash in lieu of share price is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmCashInLieuOfSharePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected CorporateActionPrice overSubscriptionDepositPriceRelatedEvent;
	/**
	 * Corporate action event for which an over subscription deposit price is
	 * provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmOverSubscriptionDepositPrice
	 * CorporateActionPrice.mmOverSubscriptionDepositPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OverSubscriptionDepositPriceRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which an over subscription deposit price is provided."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOverSubscriptionDepositPriceRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OverSubscriptionDepositPriceRelatedEvent";
			definition = "Corporate action event for which an over subscription deposit price is provided.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmOverSubscriptionDepositPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected CorporateActionPrice cashValueForTaxRelatedEvent;
	/**
	 * Corporate action event for which a cash value has been provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmCashValueForTax
	 * CorporateActionPrice.mmCashValueForTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashValueForTaxRelatedEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action event for which a cash value has been provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashValueForTaxRelatedEvent = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashValueForTaxRelatedEvent";
			definition = "Corporate action event for which a cash value has been provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmCashValueForTax;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected BiddingConditions maximumPriceBiddingConditions;
	/**
	 * Bidding conditions for which a maximum price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumPrice
	 * BiddingConditions.mmMaximumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumPriceBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a maximum price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMaximumPriceBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MaximumPriceBiddingConditions";
			definition = "Bidding conditions for which a maximum price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmMaximumPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected BiddingConditions minimumPriceBiddingConditions;
	/**
	 * Bidding conditions for which a minimum price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMinimumPrice
	 * BiddingConditions.mmMinimumPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BiddingConditions
	 * BiddingConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MinimumPriceBiddingConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Bidding conditions for which a minimum price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMinimumPriceBiddingConditions = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MinimumPriceBiddingConditions";
			definition = "Bidding conditions for which a minimum price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmMinimumPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BiddingConditions.mmObject();
		}
	};
	protected ISODateTime quotationDate;
	/**
	 * Date on which the price is obtained.
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
	 * {@linkplain com.tools20022.repository.msg.PriceInformation2#mmQuotationDate
	 * PriceInformation2.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionDate4#mmQuotationSettingDate
	 * CorporateActionDate4.mmQuotationSettingDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation11#mmQuotationDate
	 * PriceInformation11.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation12#mmQuotationDate
	 * PriceInformation12.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#mmQuotationDate
	 * PriceInformation13.mmQuotationDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which the price is obtained."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmQuotationDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(PriceInformation2.mmQuotationDate, CorporateActionDate4.mmQuotationSettingDate, PriceInformation11.mmQuotationDate, PriceInformation12.mmQuotationDate, PriceInformation13.mmQuotationDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "QuotationDate";
			definition = "Date on which the price is obtained.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getQuotationDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<com.tools20022.repository.entity.YieldCalculation> yieldCalculation;
	/**
	 * Rate of return on an investment, based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmRedemptionPrice
	 * YieldCalculation.mmRedemptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.YieldCalculation
	 * YieldCalculation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentStipulations2#mmYieldRange
	 * FinancialInstrumentStipulations2.mmYieldRange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "YieldCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate of return on an investment, based on the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmYieldCalculation = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(FinancialInstrumentStipulations2.mmYieldRange);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "YieldCalculation";
			definition = "Rate of return on an investment, based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmRedemptionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.YieldCalculation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.SecuritiesFinancing> relatedSecuritiesFinancing;
	/**
	 * Securities financing process for which an end price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmEndPrice
	 * SecuritiesFinancing.mmEndPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesFinancing
	 * SecuritiesFinancing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedSecuritiesFinancing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities financing process for which an end price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedSecuritiesFinancing = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedSecuritiesFinancing";
			definition = "Securities financing process for which an end price is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmEndPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesFinancing.mmObject();
		}
	};
	protected InvestmentFundOrderExecution fundOrderRelatedToExecutedPrice;
	/**
	 * Fund order for which an executed price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
	 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrderRelatedToExecutedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund order for which an executed price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFundOrderRelatedToExecutedPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundOrderRelatedToExecutedPrice";
			definition = "Fund order for which an executed price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmExecutedTradePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}
	};
	protected InvestmentFundOrderExecution fundOrderRelatedToInformativePrice;
	/**
	 * Fund order for which an informative price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmInformativePrice
	 * InvestmentFundOrderExecution.mmInformativePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution
	 * InvestmentFundOrderExecution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundOrderRelatedToInformativePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Fund order for which an informative price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmFundOrderRelatedToInformativePrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FundOrderRelatedToInformativePrice";
			definition = "Fund order for which an informative price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInformativePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InvestmentFundOrderExecution.mmObject();
		}
	};
	protected TaxVoucher taxVoucher;
	/**
	 * Tax voucher for which the cost per share is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmScripDividendReinvestmentPricePerShare
	 * TaxVoucher.mmScripDividendReinvestmentPricePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.TaxVoucher
	 * TaxVoucher}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucher"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax voucher for which the cost per share is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmTaxVoucher = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "TaxVoucher";
			definition = "Tax voucher for which the cost per share is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmScripDividendReinvestmentPricePerShare;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.TaxVoucher.mmObject();
		}
	};
	protected SecuritiesTrade securitiesTrade;
	/**
	 * Trade for which the trade price is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade#mmTradePrice
	 * SecuritiesTrade.mmTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade for which the trade price is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSecuritiesTrade = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SecuritiesTrade";
			definition = "Trade for which the trade price is calculated.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmTradePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesTrade.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.NetAssetValueCalculation> netAssetValueCalculation;
	/**
	 * Value calculation for which a securities pricing is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation#mmPrice
	 * NetAssetValueCalculation.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.NetAssetValueCalculation
	 * NetAssetValueCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAssetValueCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Value calculation for which a securities pricing is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmNetAssetValueCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "NetAssetValueCalculation";
			definition = "Value calculation for which a securities pricing is specified.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.NetAssetValueCalculation.mmObject();
		}
	};
	protected BuyIn relatedBuyIn;
	/**
	 * BuyIn process for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.BuyIn#mmBuyInPrice
	 * BuyIn.mmBuyInPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.BuyIn BuyIn}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedBuyIn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "BuyIn process for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedBuyIn = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedBuyIn";
			definition = "BuyIn process for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.BuyIn.mmBuyInPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.BuyIn.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.Index> index;
	/**
	 * Specifies the index information when used for calculating the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmSecuritiesPricing
	 * Index.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Index Index}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BasketDescription3#mmIndex
	 * BasketDescription3.mmIndex}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Index"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the index information when used for calculating the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIndex = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(BasketDescription3.mmIndex);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Index";
			definition = "Specifies the index information when used for calculating the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Index.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Index.mmObject();
		}
	};
	protected InformationPartyRole informationPartyRole;
	/**
	 * Party which provided the pricing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole#mmPrice
	 * InformationPartyRole.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.InformationPartyRole
	 * InformationPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationPartyRole"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party which provided the pricing."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmInformationPartyRole = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InformationPartyRole";
			definition = "Party which provided the pricing.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.InformationPartyRole.mmObject();
		}
	};
	protected DateTimePeriod priceFactPeriod;
	/**
	 * Period during which the price fact type is valid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DateTimePeriod#mmPriceFactRelatedPricing
	 * DateTimePeriod.mmPriceFactRelatedPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DateTimePeriod
	 * DateTimePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceFactPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Period during which the price fact type is valid."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceFactPeriod = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceFactPeriod";
			definition = "Period during which the price fact type is valid.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmPriceFactRelatedPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DateTimePeriod.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.AnalyticsCalculation> analyticsCalculation;
	/**
	 * Calculated analytics based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation#mmSecuritiesPricing
	 * AnalyticsCalculation.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.AnalyticsCalculation
	 * AnalyticsCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnalyticsCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated analytics based on the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAnalyticsCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "AnalyticsCalculation";
			definition = "Calculated analytics based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.AnalyticsCalculation.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.AnalyticsCalculation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.DurationCalculation> durationCalculation;
	/**
	 * Calculated duration based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.DurationCalculation#mmRelatedSecuritiesPricing
	 * DurationCalculation.mmRelatedSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.DurationCalculation
	 * DurationCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DurationCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated duration based on the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDurationCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DurationCalculation";
			definition = "Calculated duration based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmRelatedSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.DurationCalculation.mmObject();
		}
	};
	protected List<com.tools20022.repository.entity.LifeCalculation> lifeCalculation;
	/**
	 * Calculated life based on the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.LifeCalculation#mmSecuritiesPricing
	 * LifeCalculation.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.LifeCalculation
	 * LifeCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LifeCalculation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Calculated  life based on the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmLifeCalculation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "LifeCalculation";
			definition = "Calculated  life based on the price.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.LifeCalculation.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.LifeCalculation.mmObject();
		}
	};
	protected ISODateTime date;
	/**
	 * Date/time of the price. For CIV, this is the NAV date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Date"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date/time of the price. For CIV, this is the NAV date."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute mmDate = new MMBusinessAttribute() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Date";
			definition = "Date/time of the price. For CIV, this is the NAV date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesPricing.class.getMethod("getDate", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Spread spread;
	/**
	 * Spread which uses the price as benchmark.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Spread#mmBenchmarkPrice
	 * Spread.mmBenchmarkPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Spread Spread}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Spread"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Spread which uses the price as benchmark."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSpread = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Spread";
			definition = "Spread which uses the price as benchmark.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Spread.mmBenchmarkPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Spread.mmObject();
		}
	};
	protected SecuritiesOrder order;
	/**
	 * Securities order for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmOrderPrice
	 * SecuritiesOrder.mmOrderPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Order"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities order for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Order";
			definition = "Securities order for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmOrderPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected SecuritiesOrder stopPriceOrder;
	/**
	 * Order for which a stop price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmStopPrice
	 * SecuritiesOrder.mmStopPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SecuritiesOrder
	 * SecuritiesOrder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StopPriceOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a stop price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmStopPriceOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "StopPriceOrder";
			definition = "Order for which a stop price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmStopPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrder.mmObject();
		}
	};
	protected Allocation allocation;
	/**
	 * Allocation process for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Allocation#mmAllocatedPrice
	 * Allocation.mmAllocatedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Allocation
	 * Allocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Allocation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Allocation process for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmAllocation = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Allocation";
			definition = "Allocation process for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Allocation.mmAllocatedPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Allocation.mmObject();
		}
	};
	protected SecuritiesOrderParameters relatedOrder;
	/**
	 * Order for which a previous closing price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters#mmPreviousClosingPrice
	 * SecuritiesOrderParameters.mmPreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrderParameters
	 * SecuritiesOrderParameters}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Order for which a previous closing price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedOrder = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedOrder";
			definition = "Order for which a previous closing price is specified.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmPreviousClosingPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesOrderParameters.mmObject();
		}
	};
	protected Issuance issuance;
	/**
	 * Issuance for which a discount is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Issuance#mmOriginalIssueDiscount
	 * Issuance.mmOriginalIssueDiscount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Issuance Issuance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuance for which a discount is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmIssuance = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			definition = "Issuance for which a discount is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Issuance.mmOriginalIssueDiscount;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Issuance.mmObject();
		}
	};
	protected Entitlement entitlement;
	/**
	 * Entitlement for which a strike price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Entitlement#mmStrikePrice
	 * Entitlement.mmStrikePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Entitlement
	 * Entitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Entitlement for which a strike price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmEntitlement = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Entitlement";
			definition = "Entitlement for which a strike price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Entitlement.mmStrikePrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Entitlement.mmObject();
		}
	};
	protected SecuritiesDistribution cashFractionsPriceRelatedSecuritiesDistribution;
	/**
	 * Securities distribution for which a cash fractions price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmCashFractionsPrice
	 * SecuritiesDistribution.mmCashFractionsPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashFractionsPriceRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a cash fractions price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmCashFractionsPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashFractionsPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a cash fractions price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmCashFractionsPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected SecuritiesDistribution suscriptionPriceRelatedSecuritiesDistribution;
	/**
	 * Securities distribution for which a subscription price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmSubscriptionPrice
	 * SecuritiesDistribution.mmSubscriptionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SuscriptionPriceRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a subscription price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmSuscriptionPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SuscriptionPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a subscription price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmSubscriptionPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected SecuritiesDistribution reinvestmentPriceRelatedSecuritiesDistribution;
	/**
	 * Securities distribution for which a reinvestment price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution#mmReinvestmentPrice
	 * SecuritiesDistribution.mmReinvestmentPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDistribution
	 * SecuritiesDistribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReinvestmentPriceRelatedSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities distribution for which a reinvestment price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmReinvestmentPriceRelatedSecuritiesDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "ReinvestmentPriceRelatedSecuritiesDistribution";
			definition = "Securities distribution for which a reinvestment price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmReinvestmentPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.SecuritiesDistribution.mmObject();
		}
	};
	protected Derivative relatedFuture;
	/**
	 * Contract for which a tick is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Derivative#mmTick
	 * Derivative.mmTick}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Derivative
	 * Derivative}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedFuture"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contract for which a tick is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedFuture = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedFuture";
			definition = "Contract for which a tick is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Derivative.mmTick;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Derivative.mmObject();
		}
	};
	protected Distribution distribution;
	/**
	 * Distribution for which an offer price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Distribution#mmOfferPrice
	 * Distribution.mmOfferPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Distribution
	 * Distribution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Distribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution for which an offer price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmDistribution = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Distribution";
			definition = "Distribution for which an offer price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Distribution.mmOfferPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Distribution.mmObject();
		}
	};
	protected RedemptionSchedule priceChangeRedemptionSchedule;
	/**
	 * Redemption schedule for which a change in price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPriceChange
	 * RedemptionSchedule.mmPriceChange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceChangeRedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Redemption schedule for which a change in price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceChangeRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceChangeRedemptionSchedule";
			definition = "Redemption schedule for which a change in price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmPriceChange;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
		}
	};
	protected RedemptionSchedule relatedRedemptionSchedule;
	/**
	 * Redemption schedule for which a price is specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RedemptionSchedule#mmPrice
	 * RedemptionSchedule.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RedemptionSchedule
	 * RedemptionSchedule}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRedemptionSchedule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Redemption schedule for which a price is specified."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedRedemptionSchedule = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedRedemptionSchedule";
			definition = "Redemption schedule for which a price is specified.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.RedemptionSchedule.mmObject();
		}
	};
	protected Quote previousClosingPriceRelatedQuote;
	/**
	 * Quote which contains a previous closing price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmPreviousClosingPrice
	 * Quote.mmPreviousClosingPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousClosingPriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a previous closing price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPreviousClosingPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PreviousClosingPriceRelatedQuote";
			definition = "Quote which contains a previous closing price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmPreviousClosingPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected Quote requestedPriceRelatedQuote;
	/**
	 * Quote which contains a requested price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmRequestedPrice
	 * Quote.mmRequestedPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedPriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a requested price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRequestedPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RequestedPriceRelatedQuote";
			definition = "Quote which contains a requested price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmRequestedPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected Quote priceRelatedQuote;
	/**
	 * Quote which contains a price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Quote#mmPrice
	 * Quote.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PriceRelatedQuote";
			definition = "Quote which contains a price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected Quote marketPriceRelatedQuote;
	/**
	 * Quote which contains a market price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Quote#mmMarketPrice
	 * Quote.mmMarketPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Quote Quote}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketPriceRelatedQuote"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quote which contains a market price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmMarketPriceRelatedQuote = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MarketPriceRelatedQuote";
			definition = "Quote which contains a market price.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Quote.mmMarketPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Quote.mmObject();
		}
	};
	protected Price price;
	/**
	 * Value of the price.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmSecuritiesPricing
	 * Price.mmSecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Price Price}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmValueInInvestmentCurrency
	 * UnitPrice15.mmValueInInvestmentCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.UnitPrice15#mmValueInAlternativeCurrency
	 * UnitPrice15.mmValueInAlternativeCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountChoice#mmAmount
	 * PriceRateOrAmountChoice.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice3#mmPriceValue
	 * AmountPrice3.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount2#mmPriceValue
	 * AmountPricePerAmount2.mmPriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice2#mmPriceValue
	 * AmountPrice2.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknownChoice#mmAmount
	 * PriceRateOrAmountOrUnknownChoice.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AmountPrice1#mmPriceValue
	 * AmountPrice1.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity1#mmPriceValue
	 * AmountPricePerFinancialInstrumentQuantity1.mmPriceValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerAmount1#mmPriceValue
	 * AmountPricePerAmount1.mmPriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceAndDirection1#mmValue
	 * PriceAndDirection1.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PriceValueAndRate4#mmValue
	 * PriceValueAndRate4.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10#mmCurrentPrice
	 * PriceInformation10.mmCurrentPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PriceInformation10#mmPreviousPrice
	 * PriceInformation10.mmPreviousPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order17#mmDealPrice
	 * Order17.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Order18#mmDealPrice
	 * Order18.mmDealPrice}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice20#mmValue
	 * UnitPrice20.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice19#mmValue
	 * UnitPrice19.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#mmMonetaryValue
	 * SecuritiesTransactionPrice2Choice.mmMonetaryValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity6#mmPriceValue
	 * AmountPricePerFinancialInstrumentQuantity6.mmPriceValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice21#mmValue
	 * UnitPrice21.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.UnitPrice22#mmValue
	 * UnitPrice22.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransparencyDataReport11#mmInstrumentPrice
	 * TransparencyDataReport11.mmInstrumentPrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Price"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmPrice = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(UnitPrice15.mmValueInInvestmentCurrency, UnitPrice15.mmValueInAlternativeCurrency, PriceRateOrAmountChoice.mmAmount, AmountPrice3.mmPriceValue, AmountPricePerAmount2.mmPriceValue,
					AmountPrice2.mmPriceValue, PriceRateOrAmountOrUnknownChoice.mmAmount, AmountPrice1.mmPriceValue, AmountPricePerFinancialInstrumentQuantity1.mmPriceValue, AmountPricePerAmount1.mmPriceValue, PriceAndDirection1.mmValue,
					PriceValueAndRate4.mmValue, PriceInformation10.mmCurrentPrice, PriceInformation10.mmPreviousPrice, Order17.mmDealPrice, Order18.mmDealPrice, UnitPrice20.mmValue, UnitPrice19.mmValue,
					SecuritiesTransactionPrice2Choice.mmMonetaryValue, AmountPricePerFinancialInstrumentQuantity6.mmPriceValue, UnitPrice21.mmValue, UnitPrice22.mmValue, TransparencyDataReport11.mmInstrumentPrice);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Price";
			definition = "Value of the price.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Price.mmSecuritiesPricing;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Price.mmObject();
		}
	};
	protected CorporateActionPrice relatedCorporateActionPrice;
	/**
	 * Corporate action price for which pricing information is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice#mmPricingCalculation
	 * CorporateActionPrice.mmPricingCalculation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionPrice
	 * CorporateActionPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCorporateActionPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Corporate action price for which pricing information is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedCorporateActionPrice = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedCorporateActionPrice";
			definition = "Corporate action price for which pricing information is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmPricingCalculation;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CorporateActionPrice.mmObject();
		}
	};
	protected Position relatedPosition;
	/**
	 * Position for which a price is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Position#mmPrice
	 * Position.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Position Position}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedPosition"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Position for which a price is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd mmRelatedPosition = new MMBusinessAssociationEnd() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.SecuritiesPricing.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedPosition";
			definition = "Position for which a price is provided.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> com.tools20022.repository.entity.Position.mmPrice;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Position.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesPricing";
				definition = "Characteristics related to the price of the security.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Security.mmPricing, com.tools20022.repository.entity.InformationPartyRole.mmPrice,
						com.tools20022.repository.entity.NetAssetValueCalculation.mmPrice, com.tools20022.repository.entity.RedemptionSchedule.mmPriceChange, com.tools20022.repository.entity.RedemptionSchedule.mmPrice,
						com.tools20022.repository.entity.DateTimePeriod.mmPriceCalculationRelatedPricing, com.tools20022.repository.entity.DateTimePeriod.mmPriceFactRelatedPricing,
						com.tools20022.repository.entity.SecuritiesTrade.mmTradePrice, com.tools20022.repository.entity.InvestmentFundOrderExecution.mmExecutedTradePrice,
						com.tools20022.repository.entity.InvestmentFundOrderExecution.mmInformativePrice, com.tools20022.repository.entity.LotBreakdown.mmLotPrice, com.tools20022.repository.entity.Price.mmSecuritiesPricing,
						com.tools20022.repository.entity.ValuationStatistics.mmPriceChange, com.tools20022.repository.entity.ValuationStatistics.mmHighestPriceValue, com.tools20022.repository.entity.ValuationStatistics.mmLowestPriceValue,
						com.tools20022.repository.entity.SecuritiesTradeExecution.mmDealPrice, com.tools20022.repository.entity.Derivative.mmTick, com.tools20022.repository.entity.Derivative.mmExercisePrice,
						com.tools20022.repository.entity.Issuance.mmOriginalIssueDiscount, com.tools20022.repository.entity.Index.mmSecuritiesPricing, com.tools20022.repository.entity.Warrant.mmSubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesConversion.mmConversionPrice, com.tools20022.repository.entity.SecuritiesFinancing.mmEndPrice, com.tools20022.repository.entity.BiddingConditions.mmMaximumPrice,
						com.tools20022.repository.entity.BiddingConditions.mmMinimumPrice, com.tools20022.repository.entity.TaxVoucher.mmScripDividendReinvestmentPricePerShare,
						com.tools20022.repository.entity.CorporateActionPrice.mmCorporateActionExercisePrice, com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPriceReceivedPerProduct,
						com.tools20022.repository.entity.CorporateActionPrice.mmGenericCashPricePaidPerProduct, com.tools20022.repository.entity.CorporateActionPrice.mmCashInLieuOfSharePrice,
						com.tools20022.repository.entity.CorporateActionPrice.mmOverSubscriptionDepositPrice, com.tools20022.repository.entity.CorporateActionPrice.mmCashValueForTax,
						com.tools20022.repository.entity.CorporateActionPrice.mmPricingCalculation, com.tools20022.repository.entity.AmountAndQuantity.mmSecuritiesPricing, com.tools20022.repository.entity.AmountRatio.mmSecuritiesPricing,
						com.tools20022.repository.entity.Spread.mmBenchmarkPrice, com.tools20022.repository.entity.SecuritiesOrder.mmOrderPrice, com.tools20022.repository.entity.SecuritiesOrder.mmStopPrice,
						com.tools20022.repository.entity.YieldCalculation.mmRedemptionPrice, com.tools20022.repository.entity.Allocation.mmAllocatedPrice, com.tools20022.repository.entity.Distribution.mmOfferPrice,
						com.tools20022.repository.entity.BuyIn.mmBuyInPrice, com.tools20022.repository.entity.SecuritiesOrderParameters.mmPreviousClosingPrice, com.tools20022.repository.entity.Quote.mmPreviousClosingPrice,
						com.tools20022.repository.entity.Quote.mmRequestedPrice, com.tools20022.repository.entity.Quote.mmPrice, com.tools20022.repository.entity.Quote.mmMarketPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.mmCashFractionsPrice, com.tools20022.repository.entity.SecuritiesDistribution.mmSubscriptionPrice,
						com.tools20022.repository.entity.SecuritiesDistribution.mmReinvestmentPrice, com.tools20022.repository.entity.AnalyticsCalculation.mmSecuritiesPricing,
						com.tools20022.repository.entity.DurationCalculation.mmRelatedSecuritiesPricing, com.tools20022.repository.entity.LifeCalculation.mmSecuritiesPricing, com.tools20022.repository.entity.Entitlement.mmStrikePrice,
						com.tools20022.repository.entity.Position.mmPrice);
				derivationElement_lazy = () -> Arrays.asList(Price2.mmValue, PriceType1Choice.mmMarket, PriceType1Choice.mmIndicative, PriceInformation2.mmValue, PriceRate1.mmRateType, PriceInformation10.mmAmountOfChange,
						PriceInformation11.mmValue, FinancialInstrumentAggregateBalance1.mmPrice, PriceInformation12.mmValue, PriceInformation13.mmValue);
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.SecuritiesPricing.mmPriceMethod, com.tools20022.repository.entity.SecuritiesPricing.mmPriceType,
						com.tools20022.repository.entity.SecuritiesPricing.mmCumDividendIndicator, com.tools20022.repository.entity.SecuritiesPricing.mmCalculationBasis,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceChangeRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.mmRate,
						com.tools20022.repository.entity.SecuritiesPricing.mmHighestPriceValueRelatedStatistics, com.tools20022.repository.entity.SecuritiesPricing.mmLowestPriceValueRelatedStatistics,
						com.tools20022.repository.entity.SecuritiesPricing.mmSecurity, com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTradeExecution, com.tools20022.repository.entity.SecuritiesPricing.mmYielded,
						com.tools20022.repository.entity.SecuritiesPricing.mmTypeOfRate, com.tools20022.repository.entity.SecuritiesPricing.mmDerivative, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedWarrant,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedSecuritiesConversion, com.tools20022.repository.entity.SecuritiesPricing.mmLotBreakdown, com.tools20022.repository.entity.SecuritiesPricing.mmTypeOfAmount,
						com.tools20022.repository.entity.SecuritiesPricing.mmExercisePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPriceReceivedPerProductRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity, com.tools20022.repository.entity.SecuritiesPricing.mmAmountPricePerAmount,
						com.tools20022.repository.entity.SecuritiesPricing.mmGenericCashPricePaidPerProductRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmPriceCalculationPeriod,
						com.tools20022.repository.entity.SecuritiesPricing.mmCashInLieuOfSharePriceRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmOverSubscriptionDepositPriceRelatedEvent,
						com.tools20022.repository.entity.SecuritiesPricing.mmCashValueForTaxRelatedEvent, com.tools20022.repository.entity.SecuritiesPricing.mmMaximumPriceBiddingConditions,
						com.tools20022.repository.entity.SecuritiesPricing.mmMinimumPriceBiddingConditions, com.tools20022.repository.entity.SecuritiesPricing.mmQuotationDate,
						com.tools20022.repository.entity.SecuritiesPricing.mmYieldCalculation, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedSecuritiesFinancing,
						com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToExecutedPrice, com.tools20022.repository.entity.SecuritiesPricing.mmFundOrderRelatedToInformativePrice,
						com.tools20022.repository.entity.SecuritiesPricing.mmTaxVoucher, com.tools20022.repository.entity.SecuritiesPricing.mmSecuritiesTrade, com.tools20022.repository.entity.SecuritiesPricing.mmNetAssetValueCalculation,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedBuyIn, com.tools20022.repository.entity.SecuritiesPricing.mmIndex, com.tools20022.repository.entity.SecuritiesPricing.mmInformationPartyRole,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceFactPeriod, com.tools20022.repository.entity.SecuritiesPricing.mmAnalyticsCalculation,
						com.tools20022.repository.entity.SecuritiesPricing.mmDurationCalculation, com.tools20022.repository.entity.SecuritiesPricing.mmLifeCalculation, com.tools20022.repository.entity.SecuritiesPricing.mmDate,
						com.tools20022.repository.entity.SecuritiesPricing.mmSpread, com.tools20022.repository.entity.SecuritiesPricing.mmOrder, com.tools20022.repository.entity.SecuritiesPricing.mmStopPriceOrder,
						com.tools20022.repository.entity.SecuritiesPricing.mmAllocation, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedOrder, com.tools20022.repository.entity.SecuritiesPricing.mmIssuance,
						com.tools20022.repository.entity.SecuritiesPricing.mmEntitlement, com.tools20022.repository.entity.SecuritiesPricing.mmCashFractionsPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.mmSuscriptionPriceRelatedSecuritiesDistribution, com.tools20022.repository.entity.SecuritiesPricing.mmReinvestmentPriceRelatedSecuritiesDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedFuture, com.tools20022.repository.entity.SecuritiesPricing.mmDistribution,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceChangeRedemptionSchedule, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedRedemptionSchedule,
						com.tools20022.repository.entity.SecuritiesPricing.mmPreviousClosingPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.mmRequestedPriceRelatedQuote,
						com.tools20022.repository.entity.SecuritiesPricing.mmPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.mmMarketPriceRelatedQuote, com.tools20022.repository.entity.SecuritiesPricing.mmPrice,
						com.tools20022.repository.entity.SecuritiesPricing.mmRelatedCorporateActionPrice, com.tools20022.repository.entity.SecuritiesPricing.mmRelatedPosition);
				derivationComponent_lazy = () -> Arrays.asList(PriceValue1.mmObject(), UnitPrice15.mmObject(), PriceValue5.mmObject(), YieldedOrValueType1Choice.mmObject(), PriceRateOrAmountChoice.mmObject(), Price2.mmObject(),
						PriceType1Choice.mmObject(), PercentagePrice1.mmObject(), AmountPrice3.mmObject(), AmountPricePerAmount2.mmObject(), AmountPrice2.mmObject(), PriceRateOrAmountOrUnknownChoice.mmObject(),
						PriceInformation2.mmObject(), Price4.mmObject(), TypeOfPrice10Choice.mmObject(), AmountPriceType1FormatChoice.mmObject(), AmountPrice1.mmObject(), PriceFormat3Choice.mmObject(), PriceFormat4Choice.mmObject(),
						PriceFormat2Choice.mmObject(), AmountPricePerFinancialInstrumentQuantity1.mmObject(), AmountPricePerAmount1.mmObject(), PriceFormat1Choice.mmObject(), TypeOfPrice27Choice.mmObject(), PriceAndDirection1.mmObject(),
						PriceValueAndRate4.mmObject(), PriceInformation10.mmObject(), PriceInformation11.mmObject(), UnitPrice20.mmObject(), UnitPriceType2Choice.mmObject(), UnitPrice19.mmObject(), Price6.mmObject(),
						SecuritiesTransactionPrice2Choice.mmObject(), TypeOfPrice29Choice.mmObject(), TypeOfPrice30Choice.mmObject(), PriceInformation12.mmObject(), TypeOfPrice28Choice.mmObject(), PriceInformation13.mmObject(),
						AmountPricePerFinancialInstrumentQuantity6.mmObject(), IndicativeOrMarketPrice7Choice.mmObject(), PriceFormat45Choice.mmObject(), PriceFormat50Choice.mmObject(), IndicativeOrMarketPrice8Choice.mmObject(),
						PriceFormat48Choice.mmObject(), PriceFormat51Choice.mmObject(), PriceFormat46Choice.mmObject(), PriceDetails23.mmObject(), PriceFormat49Choice.mmObject(), PriceDetails22.mmObject(), PriceFormat47Choice.mmObject(),
						PriceFormat44Choice.mmObject(), UnitPrice21.mmObject(), TypeOfPrice31Choice.mmObject(), UnitPrice22.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesPricing.class;
			}
		});
		return mmObject_lazy.get();
	}

	public PriceMethodCode getPriceMethod() {
		return priceMethod;
	}

	public void setPriceMethod(PriceMethodCode priceMethod) {
		this.priceMethod = priceMethod;
	}

	public TypeOfPriceCode getPriceType() {
		return priceType;
	}

	public void setPriceType(TypeOfPriceCode priceType) {
		this.priceType = priceType;
	}

	public YesNoIndicator getCumDividendIndicator() {
		return cumDividendIndicator;
	}

	public void setCumDividendIndicator(YesNoIndicator cumDividendIndicator) {
		this.cumDividendIndicator = cumDividendIndicator;
	}

	public PercentageRate getCalculationBasis() {
		return calculationBasis;
	}

	public void setCalculationBasis(PercentageRate calculationBasis) {
		this.calculationBasis = calculationBasis;
	}

	public List<ValuationStatistics> getPriceChangeRelatedStatistics() {
		return priceChangeRelatedStatistics;
	}

	public void setPriceChangeRelatedStatistics(List<com.tools20022.repository.entity.ValuationStatistics> priceChangeRelatedStatistics) {
		this.priceChangeRelatedStatistics = priceChangeRelatedStatistics;
	}

	public PercentageRate getRate() {
		return rate;
	}

	public void setRate(PercentageRate rate) {
		this.rate = rate;
	}

	public ValuationStatistics getHighestPriceValueRelatedStatistics() {
		return highestPriceValueRelatedStatistics;
	}

	public void setHighestPriceValueRelatedStatistics(com.tools20022.repository.entity.ValuationStatistics highestPriceValueRelatedStatistics) {
		this.highestPriceValueRelatedStatistics = highestPriceValueRelatedStatistics;
	}

	public ValuationStatistics getLowestPriceValueRelatedStatistics() {
		return lowestPriceValueRelatedStatistics;
	}

	public void setLowestPriceValueRelatedStatistics(com.tools20022.repository.entity.ValuationStatistics lowestPriceValueRelatedStatistics) {
		this.lowestPriceValueRelatedStatistics = lowestPriceValueRelatedStatistics;
	}

	public List<Security> getSecurity() {
		return security;
	}

	public void setSecurity(List<com.tools20022.repository.entity.Security> security) {
		this.security = security;
	}

	public SecuritiesTradeExecution getSecuritiesTradeExecution() {
		return securitiesTradeExecution;
	}

	public void setSecuritiesTradeExecution(com.tools20022.repository.entity.SecuritiesTradeExecution securitiesTradeExecution) {
		this.securitiesTradeExecution = securitiesTradeExecution;
	}

	public YesNoIndicator getYielded() {
		return yielded;
	}

	public void setYielded(YesNoIndicator yielded) {
		this.yielded = yielded;
	}

	public PriceValueTypeCode getTypeOfRate() {
		return typeOfRate;
	}

	public void setTypeOfRate(PriceValueTypeCode typeOfRate) {
		this.typeOfRate = typeOfRate;
	}

	public List<Derivative> getDerivative() {
		return derivative;
	}

	public void setDerivative(List<com.tools20022.repository.entity.Derivative> derivative) {
		this.derivative = derivative;
	}

	public List<Warrant> getRelatedWarrant() {
		return relatedWarrant;
	}

	public void setRelatedWarrant(List<com.tools20022.repository.entity.Warrant> relatedWarrant) {
		this.relatedWarrant = relatedWarrant;
	}

	public SecuritiesConversion getRelatedSecuritiesConversion() {
		return relatedSecuritiesConversion;
	}

	public void setRelatedSecuritiesConversion(com.tools20022.repository.entity.SecuritiesConversion relatedSecuritiesConversion) {
		this.relatedSecuritiesConversion = relatedSecuritiesConversion;
	}

	public LotBreakdown getLotBreakdown() {
		return lotBreakdown;
	}

	public void setLotBreakdown(com.tools20022.repository.entity.LotBreakdown lotBreakdown) {
		this.lotBreakdown = lotBreakdown;
	}

	public AmountPriceTypeCode getTypeOfAmount() {
		return typeOfAmount;
	}

	public void setTypeOfAmount(AmountPriceTypeCode typeOfAmount) {
		this.typeOfAmount = typeOfAmount;
	}

	public CorporateActionPrice getExercisePriceRelatedEvent() {
		return exercisePriceRelatedEvent;
	}

	public void setExercisePriceRelatedEvent(com.tools20022.repository.entity.CorporateActionPrice exercisePriceRelatedEvent) {
		this.exercisePriceRelatedEvent = exercisePriceRelatedEvent;
	}

	public CorporateActionPrice getGenericCashPriceReceivedPerProductRelatedEvent() {
		return genericCashPriceReceivedPerProductRelatedEvent;
	}

	public void setGenericCashPriceReceivedPerProductRelatedEvent(com.tools20022.repository.entity.CorporateActionPrice genericCashPriceReceivedPerProductRelatedEvent) {
		this.genericCashPriceReceivedPerProductRelatedEvent = genericCashPriceReceivedPerProductRelatedEvent;
	}

	public AmountAndQuantity getAmountPricePerFinancialInstrumentQuantity() {
		return amountPricePerFinancialInstrumentQuantity;
	}

	public void setAmountPricePerFinancialInstrumentQuantity(com.tools20022.repository.entity.AmountAndQuantity amountPricePerFinancialInstrumentQuantity) {
		this.amountPricePerFinancialInstrumentQuantity = amountPricePerFinancialInstrumentQuantity;
	}

	public AmountRatio getAmountPricePerAmount() {
		return amountPricePerAmount;
	}

	public void setAmountPricePerAmount(com.tools20022.repository.entity.AmountRatio amountPricePerAmount) {
		this.amountPricePerAmount = amountPricePerAmount;
	}

	public CorporateActionPrice getGenericCashPricePaidPerProductRelatedEvent() {
		return genericCashPricePaidPerProductRelatedEvent;
	}

	public void setGenericCashPricePaidPerProductRelatedEvent(com.tools20022.repository.entity.CorporateActionPrice genericCashPricePaidPerProductRelatedEvent) {
		this.genericCashPricePaidPerProductRelatedEvent = genericCashPricePaidPerProductRelatedEvent;
	}

	public DateTimePeriod getPriceCalculationPeriod() {
		return priceCalculationPeriod;
	}

	public void setPriceCalculationPeriod(com.tools20022.repository.entity.DateTimePeriod priceCalculationPeriod) {
		this.priceCalculationPeriod = priceCalculationPeriod;
	}

	public CorporateActionPrice getCashInLieuOfSharePriceRelatedEvent() {
		return cashInLieuOfSharePriceRelatedEvent;
	}

	public void setCashInLieuOfSharePriceRelatedEvent(com.tools20022.repository.entity.CorporateActionPrice cashInLieuOfSharePriceRelatedEvent) {
		this.cashInLieuOfSharePriceRelatedEvent = cashInLieuOfSharePriceRelatedEvent;
	}

	public CorporateActionPrice getOverSubscriptionDepositPriceRelatedEvent() {
		return overSubscriptionDepositPriceRelatedEvent;
	}

	public void setOverSubscriptionDepositPriceRelatedEvent(com.tools20022.repository.entity.CorporateActionPrice overSubscriptionDepositPriceRelatedEvent) {
		this.overSubscriptionDepositPriceRelatedEvent = overSubscriptionDepositPriceRelatedEvent;
	}

	public CorporateActionPrice getCashValueForTaxRelatedEvent() {
		return cashValueForTaxRelatedEvent;
	}

	public void setCashValueForTaxRelatedEvent(com.tools20022.repository.entity.CorporateActionPrice cashValueForTaxRelatedEvent) {
		this.cashValueForTaxRelatedEvent = cashValueForTaxRelatedEvent;
	}

	public BiddingConditions getMaximumPriceBiddingConditions() {
		return maximumPriceBiddingConditions;
	}

	public void setMaximumPriceBiddingConditions(com.tools20022.repository.entity.BiddingConditions maximumPriceBiddingConditions) {
		this.maximumPriceBiddingConditions = maximumPriceBiddingConditions;
	}

	public BiddingConditions getMinimumPriceBiddingConditions() {
		return minimumPriceBiddingConditions;
	}

	public void setMinimumPriceBiddingConditions(com.tools20022.repository.entity.BiddingConditions minimumPriceBiddingConditions) {
		this.minimumPriceBiddingConditions = minimumPriceBiddingConditions;
	}

	public ISODateTime getQuotationDate() {
		return quotationDate;
	}

	public void setQuotationDate(ISODateTime quotationDate) {
		this.quotationDate = quotationDate;
	}

	public List<YieldCalculation> getYieldCalculation() {
		return yieldCalculation;
	}

	public void setYieldCalculation(List<com.tools20022.repository.entity.YieldCalculation> yieldCalculation) {
		this.yieldCalculation = yieldCalculation;
	}

	public List<SecuritiesFinancing> getRelatedSecuritiesFinancing() {
		return relatedSecuritiesFinancing;
	}

	public void setRelatedSecuritiesFinancing(List<com.tools20022.repository.entity.SecuritiesFinancing> relatedSecuritiesFinancing) {
		this.relatedSecuritiesFinancing = relatedSecuritiesFinancing;
	}

	public InvestmentFundOrderExecution getFundOrderRelatedToExecutedPrice() {
		return fundOrderRelatedToExecutedPrice;
	}

	public void setFundOrderRelatedToExecutedPrice(com.tools20022.repository.entity.InvestmentFundOrderExecution fundOrderRelatedToExecutedPrice) {
		this.fundOrderRelatedToExecutedPrice = fundOrderRelatedToExecutedPrice;
	}

	public InvestmentFundOrderExecution getFundOrderRelatedToInformativePrice() {
		return fundOrderRelatedToInformativePrice;
	}

	public void setFundOrderRelatedToInformativePrice(com.tools20022.repository.entity.InvestmentFundOrderExecution fundOrderRelatedToInformativePrice) {
		this.fundOrderRelatedToInformativePrice = fundOrderRelatedToInformativePrice;
	}

	public TaxVoucher getTaxVoucher() {
		return taxVoucher;
	}

	public void setTaxVoucher(com.tools20022.repository.entity.TaxVoucher taxVoucher) {
		this.taxVoucher = taxVoucher;
	}

	public SecuritiesTrade getSecuritiesTrade() {
		return securitiesTrade;
	}

	public void setSecuritiesTrade(com.tools20022.repository.entity.SecuritiesTrade securitiesTrade) {
		this.securitiesTrade = securitiesTrade;
	}

	public List<NetAssetValueCalculation> getNetAssetValueCalculation() {
		return netAssetValueCalculation;
	}

	public void setNetAssetValueCalculation(List<com.tools20022.repository.entity.NetAssetValueCalculation> netAssetValueCalculation) {
		this.netAssetValueCalculation = netAssetValueCalculation;
	}

	public BuyIn getRelatedBuyIn() {
		return relatedBuyIn;
	}

	public void setRelatedBuyIn(com.tools20022.repository.entity.BuyIn relatedBuyIn) {
		this.relatedBuyIn = relatedBuyIn;
	}

	public List<Index> getIndex() {
		return index;
	}

	public void setIndex(List<com.tools20022.repository.entity.Index> index) {
		this.index = index;
	}

	public InformationPartyRole getInformationPartyRole() {
		return informationPartyRole;
	}

	public void setInformationPartyRole(com.tools20022.repository.entity.InformationPartyRole informationPartyRole) {
		this.informationPartyRole = informationPartyRole;
	}

	public DateTimePeriod getPriceFactPeriod() {
		return priceFactPeriod;
	}

	public void setPriceFactPeriod(com.tools20022.repository.entity.DateTimePeriod priceFactPeriod) {
		this.priceFactPeriod = priceFactPeriod;
	}

	public List<AnalyticsCalculation> getAnalyticsCalculation() {
		return analyticsCalculation;
	}

	public void setAnalyticsCalculation(List<com.tools20022.repository.entity.AnalyticsCalculation> analyticsCalculation) {
		this.analyticsCalculation = analyticsCalculation;
	}

	public List<DurationCalculation> getDurationCalculation() {
		return durationCalculation;
	}

	public void setDurationCalculation(List<com.tools20022.repository.entity.DurationCalculation> durationCalculation) {
		this.durationCalculation = durationCalculation;
	}

	public List<LifeCalculation> getLifeCalculation() {
		return lifeCalculation;
	}

	public void setLifeCalculation(List<com.tools20022.repository.entity.LifeCalculation> lifeCalculation) {
		this.lifeCalculation = lifeCalculation;
	}

	public ISODateTime getDate() {
		return date;
	}

	public void setDate(ISODateTime date) {
		this.date = date;
	}

	public Spread getSpread() {
		return spread;
	}

	public void setSpread(com.tools20022.repository.entity.Spread spread) {
		this.spread = spread;
	}

	public SecuritiesOrder getOrder() {
		return order;
	}

	public void setOrder(com.tools20022.repository.entity.SecuritiesOrder order) {
		this.order = order;
	}

	public SecuritiesOrder getStopPriceOrder() {
		return stopPriceOrder;
	}

	public void setStopPriceOrder(com.tools20022.repository.entity.SecuritiesOrder stopPriceOrder) {
		this.stopPriceOrder = stopPriceOrder;
	}

	public Allocation getAllocation() {
		return allocation;
	}

	public void setAllocation(com.tools20022.repository.entity.Allocation allocation) {
		this.allocation = allocation;
	}

	public SecuritiesOrderParameters getRelatedOrder() {
		return relatedOrder;
	}

	public void setRelatedOrder(com.tools20022.repository.entity.SecuritiesOrderParameters relatedOrder) {
		this.relatedOrder = relatedOrder;
	}

	public Issuance getIssuance() {
		return issuance;
	}

	public void setIssuance(com.tools20022.repository.entity.Issuance issuance) {
		this.issuance = issuance;
	}

	public Entitlement getEntitlement() {
		return entitlement;
	}

	public void setEntitlement(com.tools20022.repository.entity.Entitlement entitlement) {
		this.entitlement = entitlement;
	}

	public SecuritiesDistribution getCashFractionsPriceRelatedSecuritiesDistribution() {
		return cashFractionsPriceRelatedSecuritiesDistribution;
	}

	public void setCashFractionsPriceRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution cashFractionsPriceRelatedSecuritiesDistribution) {
		this.cashFractionsPriceRelatedSecuritiesDistribution = cashFractionsPriceRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getSuscriptionPriceRelatedSecuritiesDistribution() {
		return suscriptionPriceRelatedSecuritiesDistribution;
	}

	public void setSuscriptionPriceRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution suscriptionPriceRelatedSecuritiesDistribution) {
		this.suscriptionPriceRelatedSecuritiesDistribution = suscriptionPriceRelatedSecuritiesDistribution;
	}

	public SecuritiesDistribution getReinvestmentPriceRelatedSecuritiesDistribution() {
		return reinvestmentPriceRelatedSecuritiesDistribution;
	}

	public void setReinvestmentPriceRelatedSecuritiesDistribution(com.tools20022.repository.entity.SecuritiesDistribution reinvestmentPriceRelatedSecuritiesDistribution) {
		this.reinvestmentPriceRelatedSecuritiesDistribution = reinvestmentPriceRelatedSecuritiesDistribution;
	}

	public Derivative getRelatedFuture() {
		return relatedFuture;
	}

	public void setRelatedFuture(com.tools20022.repository.entity.Derivative relatedFuture) {
		this.relatedFuture = relatedFuture;
	}

	public Distribution getDistribution() {
		return distribution;
	}

	public void setDistribution(com.tools20022.repository.entity.Distribution distribution) {
		this.distribution = distribution;
	}

	public RedemptionSchedule getPriceChangeRedemptionSchedule() {
		return priceChangeRedemptionSchedule;
	}

	public void setPriceChangeRedemptionSchedule(com.tools20022.repository.entity.RedemptionSchedule priceChangeRedemptionSchedule) {
		this.priceChangeRedemptionSchedule = priceChangeRedemptionSchedule;
	}

	public RedemptionSchedule getRelatedRedemptionSchedule() {
		return relatedRedemptionSchedule;
	}

	public void setRelatedRedemptionSchedule(com.tools20022.repository.entity.RedemptionSchedule relatedRedemptionSchedule) {
		this.relatedRedemptionSchedule = relatedRedemptionSchedule;
	}

	public Quote getPreviousClosingPriceRelatedQuote() {
		return previousClosingPriceRelatedQuote;
	}

	public void setPreviousClosingPriceRelatedQuote(com.tools20022.repository.entity.Quote previousClosingPriceRelatedQuote) {
		this.previousClosingPriceRelatedQuote = previousClosingPriceRelatedQuote;
	}

	public Quote getRequestedPriceRelatedQuote() {
		return requestedPriceRelatedQuote;
	}

	public void setRequestedPriceRelatedQuote(com.tools20022.repository.entity.Quote requestedPriceRelatedQuote) {
		this.requestedPriceRelatedQuote = requestedPriceRelatedQuote;
	}

	public Quote getPriceRelatedQuote() {
		return priceRelatedQuote;
	}

	public void setPriceRelatedQuote(com.tools20022.repository.entity.Quote priceRelatedQuote) {
		this.priceRelatedQuote = priceRelatedQuote;
	}

	public Quote getMarketPriceRelatedQuote() {
		return marketPriceRelatedQuote;
	}

	public void setMarketPriceRelatedQuote(com.tools20022.repository.entity.Quote marketPriceRelatedQuote) {
		this.marketPriceRelatedQuote = marketPriceRelatedQuote;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(com.tools20022.repository.entity.Price price) {
		this.price = price;
	}

	public CorporateActionPrice getRelatedCorporateActionPrice() {
		return relatedCorporateActionPrice;
	}

	public void setRelatedCorporateActionPrice(com.tools20022.repository.entity.CorporateActionPrice relatedCorporateActionPrice) {
		this.relatedCorporateActionPrice = relatedCorporateActionPrice;
	}

	public Position getRelatedPosition() {
		return relatedPosition;
	}

	public void setRelatedPosition(com.tools20022.repository.entity.Position relatedPosition) {
		this.relatedPosition = relatedPosition;
	}
}