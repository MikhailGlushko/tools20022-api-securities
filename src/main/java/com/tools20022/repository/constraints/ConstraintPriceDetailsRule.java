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

package com.tools20022.repository.constraints;

import com.tools20022.core.repo.NotImplementedConstraintException;
import com.tools20022.metamodel.MMConstraint;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.msg.PriceValuation4;

/**
 * If SuspendedIndicator is "true" or "1" (Yes), then PriceDetails is optional.
 * If SuspendedIndicator is "false" or "0" (No), and if
 * FinancialInstrumentDetails /DualFundIndicator is "false" or "0" (No), then
 * PriceDetails must be present at least once. If SuspendedIndicator is "false"
 * or "0" (No), and if FinancialInstrumentDetails /DualFundIndicator is "true"
 * or "1" (Yes), then PriceDetails must be present two or more times and
 * PriceDetails/Type must be present with the values "BIDE" and "OFFR".
 */
public class ConstraintPriceDetailsRule {

	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMConstraint#getOwner owner} =
	 * {@linkplain com.tools20022.repository.msg.PriceValuation4
	 * PriceValuation4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If SuspendedIndicator is \"true\" or \"1\" (Yes), then PriceDetails is optional.\nIf SuspendedIndicator is \"false\" or \"0\" (No), and if FinancialInstrumentDetails /DualFundIndicator is \"false\" or \"0\" (No), then PriceDetails must be present at least once.\nIf SuspendedIndicator is \"false\" or \"0\" (No), and if FinancialInstrumentDetails /DualFundIndicator is \"true\" or \"1\" (Yes), then PriceDetails must be present two or more times and PriceDetails/Type must be present with the values \"BIDE\" and \"OFFR\"."
	 * </li>
	 * </ul>
	 */
	public static final MMConstraint<PriceValuation4> forPriceValuation4 = new MMConstraint<PriceValuation4>() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetailsRule";
			definition = "If SuspendedIndicator is \"true\" or \"1\" (Yes), then PriceDetails is optional.\nIf SuspendedIndicator is \"false\" or \"0\" (No), and if FinancialInstrumentDetails /DualFundIndicator is \"false\" or \"0\" (No), then PriceDetails must be present at least once.\nIf SuspendedIndicator is \"false\" or \"0\" (No), and if FinancialInstrumentDetails /DualFundIndicator is \"true\" or \"1\" (Yes), then PriceDetails must be present two or more times and PriceDetails/Type must be present with the values \"BIDE\" and \"OFFR\".";
			owner_lazy = () -> PriceValuation4.mmObject();
		}

		@Override
		public void executeValidator(PriceValuation4 obj) throws Exception {
			checkPriceValuation4(obj);
		}
	};

	/**
	 * If SuspendedIndicator is "true" or "1" (Yes), then PriceDetails is
	 * optional. If SuspendedIndicator is "false" or "0" (No), and if
	 * FinancialInstrumentDetails /DualFundIndicator is "false" or "0" (No),
	 * then PriceDetails must be present at least once. If SuspendedIndicator is
	 * "false" or "0" (No), and if FinancialInstrumentDetails /DualFundIndicator
	 * is "true" or "1" (Yes), then PriceDetails must be present two or more
	 * times and PriceDetails/Type must be present with the values "BIDE" and
	 * "OFFR".
	 */
	public static void checkPriceValuation4(PriceValuation4 obj) throws Exception {
		throw new NotImplementedConstraintException();
	}
}