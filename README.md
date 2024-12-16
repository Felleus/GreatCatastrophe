<html>
<body>
<!--StartFragment--><html><head></head><body><h3><strong>GreatCatastrophe – Плагин катастроф для Minecraft (Spigot/Paper)</strong></h3>
<p><strong>GreatCatastrophe</strong> добавляет в Minecraft катастрофические события, создавая новые вызовы и динамику для игроков. Идеальный выбор для серверов, которые ищут новые ивенты, хаос и увлекательный геймплей.</p>
<hr>
<h2><strong>Основные возможности</strong></h2>
<h3><strong>1. Кислотный дождь (Acid Rain)</strong></h3>
<ul>
<li>Активируется командой <code inline="">/acidrain</code>.</li>
<li>Игроки получают урон и эффект отравления.</li>
<li>Специальные частицы и визуальные эффекты.</li>
<li><strong>Настройка</strong>: длительность и сообщения через <code inline="">config.yml</code>.</li>
</ul>
<h3><strong>2. Шторм молний (Lightning Storm)</strong></h3>
<ul>
<li>Команда <code inline="">/lightningstorm</code> вызывает молнии вокруг игроков.</li>
<li>Настраиваемый радиус, интенсивность и длительность шторма.</li>
</ul>
<h3><strong>3. Месть мирных животных (Revenge of Peaceful Animals)</strong></h3>
<ul>
<li>При атаке мирного животного с шансом появляются:
<ul>
<li><strong>Vindicator</strong> (Мстительный дровосек).</li>
<li><strong>Заряженный Creeper</strong>.</li>
<li><strong>Silverfish</strong> (Чешуйница).</li>
</ul>
</li>
<li>Командой <code inline="">/revenge</code> активируется событие на определённое время.</li>
<li><strong>Настройка</strong>: шанс появления и сообщения через <code inline="">config.yml</code>.</li>
</ul>
<hr>
<h2><strong>Команды и права</strong></h2>

Команда | Описание | Права
-- | -- | --
/acidrain | Запускает кислотный дождь. | greatcatastrophe.acidrain
/lightningstorm | Вызывает шторм молний. | greatcatastrophe.lightningstorm
/revenge | Активирует месть мирных животных на время. | greatcatastrophe.revenge


<hr>
<h2><strong>Пример конфигурации (<code inline="">config.yml</code>)</strong></h2>
<pre><code class="language-yaml">rain:
  duration: 30
  startMessage: "&lt;yellow&gt;⚠ Начался кислотный дождь! Длительность: %duration% секунд."
  endMessage: "&lt;green&gt;☀ Кислотный дождь закончился."

lightning:
  duration: 30
  intensity: 5
  radius: 30
  startMessage: "&lt;yellow&gt;⚡ Начался шторм молний! Длительность: %duration% секунд."
  endMessage: "&lt;gray&gt;🌩 Шторм молний завершен."

revenge:
  duration: 60
  startMessage: "&lt;green&gt;Месть мирных животных активирована на &lt;yellow&gt;%duration% &lt;green&gt;секунд."
  alreadyActiveMessage: "&lt;red&gt;Месть мирных животных уже активирована!"
  endMessage: "&lt;red&gt;Месть мирных животных отключена."
</code></pre>
<hr>
<h2><strong>Технологии</strong></h2>
<ul>
<li><strong>Kotlin</strong> – современный язык для разработки плагинов.</li>
<li><strong>Spigot/Paper API</strong> – основа для работы с Minecraft.</li>
<li><strong>Adventure API</strong> – поддержка форматированных сообщений через <strong>MiniMessage</strong>.</li>
<li><strong>Aikar Commands (ACF)</strong> – удобная обработка команд.</li>
</ul>
<hr>
<h2><strong>Установка плагина</strong></h2>
<ol>
<li>Скачайте JAR-файл из раздела <strong>Releases</strong>.</li>
<li>Переместите файл в папку <code inline="">plugins</code> на сервере.</li>
<li>Перезапустите сервер.</li>
<li>Настройте параметры в <code inline="">config.yml</code>.</li>
<li>Используйте команды для запуска событий.</li>
</ol>
<hr>
<h2><strong>Примеры использования</strong></h2>
<h3><strong>1. Запуск кислотного дождя</strong></h3>
<ul>
<li>Команда: <code inline="">/acidrain</code><br>
Игроки получат урон и эффект отравления.</li>
</ul>
<h3><strong>2. Старт шторма молний</strong></h3>
<ul>
<li>Команда: <code inline="">/lightningstorm</code><br>
Молнии ударят вокруг игроков в заданном радиусе.</li>
</ul>
<h3><strong>3. Активация мести мирных животных</strong></h3>
<ul>
<li>Команда: <code inline="">/revenge</code><br>
При атаке животных с шансом появятся опасные мобы.</li>
</ul>
<hr>
<h2><strong>Преимущества</strong></h2>
<ul>
<li>Полностью настраиваемые события через <code inline="">config.yml</code>.</li>
<li>Поддержка <strong>MiniMessage</strong> для гибкого форматирования сообщений.</li>
<li>Интересные механики для оживления игрового процесса.</li>
<li>Оптимизация и чистый код на <strong>Kotlin</strong>.</li>
</ul>
<hr>
<h2><strong>Совместимость</strong></h2>
<ul>
<li><strong>Minecraft</strong>: 1.16+ (Spigot/Paper).</li>
<li>Совместимость с современными серверами Minecraft.</li>
</ul>
<hr>
<h2><strong>Авторы</strong></h2>
<p><strong>Разработано Felleus Development</strong>.<br>
Приветствуем идеи и предложения! Создавайте <strong>issues</strong> и <strong>pull requests</strong>. 🚀</p>
</body>
</html>
