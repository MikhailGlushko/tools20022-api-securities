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
import com.tools20022.repository.codeset.SecuritiesTransactionType17Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies underlying information regarding the type of settlement
 * transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#CentralBankCollateralOperation
 * SecuritiesTransactionType17Code.mmCentralBankCollateralOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#BuySellBack
 * SecuritiesTransactionType17Code.mmBuySellBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#CollateralIn
 * SecuritiesTransactionType17Code.mmCollateralIn}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#CollateralOut
 * SecuritiesTransactionType17Code.mmCollateralOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#DepositoryReceiptConversion
 * SecuritiesTransactionType17Code.mmDepositoryReceiptConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#FactorUpdate
 * SecuritiesTransactionType17Code.mmFactorUpdate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#MoveOfStock
 * SecuritiesTransactionType17Code.mmMoveOfStock}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Issuance
 * SecuritiesTransactionType17Code.mmIssuance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#MarkDown
 * SecuritiesTransactionType17Code.mmMarkDown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#MarkUp
 * SecuritiesTransactionType17Code.mmMarkUp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Netting
 * SecuritiesTransactionType17Code.mmNetting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#NonSyndicated
 * SecuritiesTransactionType17Code.mmNonSyndicated}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#ExternalAccountTransfer
 * SecuritiesTransactionType17Code.mmExternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#InternalAccountTransfer
 * SecuritiesTransactionType17Code.mmInternalAccountTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#PairOff
 * SecuritiesTransactionType17Code.mmPairOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Placement
 * SecuritiesTransactionType17Code.mmPlacement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#PortfolioMove
 * SecuritiesTransactionType17Code.mmPortfolioMove}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Realignment
 * SecuritiesTransactionType17Code.mmRealignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Withdrawal
 * SecuritiesTransactionType17Code.mmWithdrawal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Redemption
 * SecuritiesTransactionType17Code.mmRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#DepositoryReceiptReleaseCancellation
 * SecuritiesTransactionType17Code.mmDepositoryReceiptReleaseCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Repo
 * SecuritiesTransactionType17Code.mmRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#ReturnDeliveryWithoutMatching
 * SecuritiesTransactionType17Code.mmReturnDeliveryWithoutMatching}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#ReverseRepo
 * SecuritiesTransactionType17Code.mmReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#SellBuyBack
 * SecuritiesTransactionType17Code.mmSellBuyBack}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#BorrowingReallocation
 * SecuritiesTransactionType17Code.mmBorrowingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#SecuritiesBorrowing
 * SecuritiesTransactionType17Code.mmSecuritiesBorrowing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#SecuritiesLending
 * SecuritiesTransactionType17Code.mmSecuritiesLending}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#LendingReallocation
 * SecuritiesTransactionType17Code.mmLendingReallocation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Subscription
 * SecuritiesTransactionType17Code.mmSubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#SyndicateUnderwriters
 * SecuritiesTransactionType17Code.mmSyndicateUnderwriters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#TBAClosing
 * SecuritiesTransactionType17Code.mmTBAClosing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Trade
 * SecuritiesTransactionType17Code.mmTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#TripartyRepo
 * SecuritiesTransactionType17Code.mmTripartyRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#TripartyReverseRepo
 * SecuritiesTransactionType17Code.mmTripartyReverseRepo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#Turnaround
 * SecuritiesTransactionType17Code.mmTurnaround}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#CorporateAction
 * SecuritiesTransactionType17Code.mmCorporateAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#MarketClaim
 * SecuritiesTransactionType17Code.mmMarketClaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#AutoCollateralisation
 * SecuritiesTransactionType17Code.mmAutoCollateralisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#ExchangeTradedFunds
 * SecuritiesTransactionType17Code.mmExchangeTradedFunds}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code#BuyIn
 * SecuritiesTransactionType17Code.mmBuyIn}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionTypeV2Code
 * SecuritiesTransactionTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CNCB"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionType17Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies underlying information regarding the type of settlement transaction."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class SecuritiesTransactionType17Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CentralBankCollateralOperation"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code CentralBankCollateralOperation = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CentralBankCollateralOperation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CentralBankCollateralOperation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuySellBack"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code BuySellBack = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuySellBack";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.BuySellBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralIn"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code CollateralIn = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralIn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CollateralIn.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralOut"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code CollateralOut = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralOut";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CollateralOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptConversion"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code DepositoryReceiptConversion = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptConversion";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.DepositoryReceiptConversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FactorUpdate"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code FactorUpdate = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FactorUpdate";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.FactorUpdate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MoveOfStock"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code MoveOfStock = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MoveOfStock";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MoveOfStock.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Issuance"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code Issuance = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Issuance";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Issuance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkDown"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code MarkDown = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkDown";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarkDown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarkUp"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code MarkUp = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarkUp";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarkUp.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Netting"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code Netting = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Netting";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Netting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonSyndicated"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code NonSyndicated = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonSyndicated";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.NonSyndicated.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExternalAccountTransfer"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code ExternalAccountTransfer = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExternalAccountTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ExternalAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InternalAccountTransfer"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code InternalAccountTransfer = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InternalAccountTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.InternalAccountTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PairOff"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code PairOff = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PairOff";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.PairOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Placement"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code Placement = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Placement";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Placement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioMove"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code PortfolioMove = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioMove";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.PortfolioMove.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Realignment"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code Realignment = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Realignment";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Realignment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withdrawal"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code Withdrawal = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withdrawal";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Withdrawal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redemption"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code Redemption = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redemption";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Redemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DepositoryReceiptReleaseCancellation"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code DepositoryReceiptReleaseCancellation = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DepositoryReceiptReleaseCancellation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.DepositoryReceiptReleaseCancellation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Repo"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code Repo = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Repo";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Repo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReturnDeliveryWithoutMatching"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code ReturnDeliveryWithoutMatching = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReturnDeliveryWithoutMatching";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ReturnDeliveryWithoutMatching.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseRepo"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code ReverseRepo = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ReverseRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellBuyBack"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code SellBuyBack = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellBuyBack";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SellBuyBack.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BorrowingReallocation"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code BorrowingReallocation = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BorrowingReallocation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.BorrowingReallocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesBorrowing"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code SecuritiesBorrowing = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesBorrowing";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SecuritiesBorrowing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesLending"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code SecuritiesLending = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesLending";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SecuritiesLending.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LendingReallocation"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code LendingReallocation = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LendingReallocation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.LendingReallocation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subscription"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code Subscription = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subscription";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Subscription.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SyndicateUnderwriters"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code SyndicateUnderwriters = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SyndicateUnderwriters";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.SyndicateUnderwriters.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TBAClosing"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code TBAClosing = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TBAClosing";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TBAClosing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Trade"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code Trade = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Trade";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Trade.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyRepo"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code TripartyRepo = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TripartyRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyReverseRepo"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code TripartyReverseRepo = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyReverseRepo";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.TripartyReverseRepo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Turnaround"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code Turnaround = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Turnaround";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.Turnaround.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateAction"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code CorporateAction = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateAction";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.CorporateAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketClaim"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code MarketClaim = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketClaim";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.MarketClaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AutoCollateralisation"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code AutoCollateralisation = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AutoCollateralisation";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.AutoCollateralisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeTradedFunds"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code ExchangeTradedFunds = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeTradedFunds";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.ExchangeTradedFunds.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.SecuritiesTransactionType17Code
	 * SecuritiesTransactionType17Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyIn"</li>
	 * </ul>
	 */
	public static final SecuritiesTransactionType17Code BuyIn = new SecuritiesTransactionType17Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyIn";
			owner_lazy = () -> com.tools20022.repository.codeset.SecuritiesTransactionType17Code.mmObject();
			codeName = SecuritiesTransactionTypeV2Code.BuyIn.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, SecuritiesTransactionType17Code> codesByName = new LinkedHashMap<>();

	protected SecuritiesTransactionType17Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("CNCB");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionType17Code";
				definition = "Specifies underlying information regarding the type of settlement transaction.";
				trace_lazy = () -> SecuritiesTransactionTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.SecuritiesTransactionType17Code.CentralBankCollateralOperation, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.BuySellBack,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.CollateralIn, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.CollateralOut,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.DepositoryReceiptConversion, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.FactorUpdate,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.MoveOfStock, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.Issuance,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.MarkDown, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.MarkUp,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.Netting, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.NonSyndicated,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.ExternalAccountTransfer, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.InternalAccountTransfer,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.PairOff, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.Placement,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.PortfolioMove, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.Realignment,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.Withdrawal, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.Redemption,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.DepositoryReceiptReleaseCancellation, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.Repo,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.ReturnDeliveryWithoutMatching, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.ReverseRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.SellBuyBack, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.BorrowingReallocation,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.SecuritiesBorrowing, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.SecuritiesLending,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.LendingReallocation, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.Subscription,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.SyndicateUnderwriters, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.TBAClosing,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.Trade, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.TripartyRepo,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.TripartyReverseRepo, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.Turnaround,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.CorporateAction, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.MarketClaim,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.AutoCollateralisation, com.tools20022.repository.codeset.SecuritiesTransactionType17Code.ExchangeTradedFunds,
						com.tools20022.repository.codeset.SecuritiesTransactionType17Code.BuyIn);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(CentralBankCollateralOperation.getCodeName().get(), CentralBankCollateralOperation);
		codesByName.put(BuySellBack.getCodeName().get(), BuySellBack);
		codesByName.put(CollateralIn.getCodeName().get(), CollateralIn);
		codesByName.put(CollateralOut.getCodeName().get(), CollateralOut);
		codesByName.put(DepositoryReceiptConversion.getCodeName().get(), DepositoryReceiptConversion);
		codesByName.put(FactorUpdate.getCodeName().get(), FactorUpdate);
		codesByName.put(MoveOfStock.getCodeName().get(), MoveOfStock);
		codesByName.put(Issuance.getCodeName().get(), Issuance);
		codesByName.put(MarkDown.getCodeName().get(), MarkDown);
		codesByName.put(MarkUp.getCodeName().get(), MarkUp);
		codesByName.put(Netting.getCodeName().get(), Netting);
		codesByName.put(NonSyndicated.getCodeName().get(), NonSyndicated);
		codesByName.put(ExternalAccountTransfer.getCodeName().get(), ExternalAccountTransfer);
		codesByName.put(InternalAccountTransfer.getCodeName().get(), InternalAccountTransfer);
		codesByName.put(PairOff.getCodeName().get(), PairOff);
		codesByName.put(Placement.getCodeName().get(), Placement);
		codesByName.put(PortfolioMove.getCodeName().get(), PortfolioMove);
		codesByName.put(Realignment.getCodeName().get(), Realignment);
		codesByName.put(Withdrawal.getCodeName().get(), Withdrawal);
		codesByName.put(Redemption.getCodeName().get(), Redemption);
		codesByName.put(DepositoryReceiptReleaseCancellation.getCodeName().get(), DepositoryReceiptReleaseCancellation);
		codesByName.put(Repo.getCodeName().get(), Repo);
		codesByName.put(ReturnDeliveryWithoutMatching.getCodeName().get(), ReturnDeliveryWithoutMatching);
		codesByName.put(ReverseRepo.getCodeName().get(), ReverseRepo);
		codesByName.put(SellBuyBack.getCodeName().get(), SellBuyBack);
		codesByName.put(BorrowingReallocation.getCodeName().get(), BorrowingReallocation);
		codesByName.put(SecuritiesBorrowing.getCodeName().get(), SecuritiesBorrowing);
		codesByName.put(SecuritiesLending.getCodeName().get(), SecuritiesLending);
		codesByName.put(LendingReallocation.getCodeName().get(), LendingReallocation);
		codesByName.put(Subscription.getCodeName().get(), Subscription);
		codesByName.put(SyndicateUnderwriters.getCodeName().get(), SyndicateUnderwriters);
		codesByName.put(TBAClosing.getCodeName().get(), TBAClosing);
		codesByName.put(Trade.getCodeName().get(), Trade);
		codesByName.put(TripartyRepo.getCodeName().get(), TripartyRepo);
		codesByName.put(TripartyReverseRepo.getCodeName().get(), TripartyReverseRepo);
		codesByName.put(Turnaround.getCodeName().get(), Turnaround);
		codesByName.put(CorporateAction.getCodeName().get(), CorporateAction);
		codesByName.put(MarketClaim.getCodeName().get(), MarketClaim);
		codesByName.put(AutoCollateralisation.getCodeName().get(), AutoCollateralisation);
		codesByName.put(ExchangeTradedFunds.getCodeName().get(), ExchangeTradedFunds);
		codesByName.put(BuyIn.getCodeName().get(), BuyIn);
	}

	public static SecuritiesTransactionType17Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static SecuritiesTransactionType17Code[] values() {
		SecuritiesTransactionType17Code[] values = new SecuritiesTransactionType17Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, SecuritiesTransactionType17Code> {
		@Override
		public SecuritiesTransactionType17Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(SecuritiesTransactionType17Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}