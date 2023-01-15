・Gitの勉強に関する動画：  
https://b23.tv/Mo32Kai

・Git（コマンドメイン）ダウンロードURL：  
https://github.com/git-for-windows/git/releases/download/v2.39.0.windows.2/Git-2.39.0.2-64-bit.exe  
※デフォルトでインストールすれば良い

・TortoiseGit（GUIメイン）ダウンロードURL：  
https://download.tortoisegit.org/tgit/2.13.0.0/TortoiseGit-2.13.0.1-64bit.msi  
※デフォルトでインストールすれば良い

・よく使いそうなgitコマンド  
https://dev.classmethod.jp/articles/git_command_for_beginner/  

・Eclipse（開発ツール）  
https://ftp.jaist.ac.jp/pub/mergedoc/pleiades/2022/pleiades-2022-12-java-win-64bit-jre_20221215.exe

・JDK1.8  
https://drive.google.com/file/d/1_LWsfatCQdvpICFQhHGnrnlja6Y-X9Gz/view?usp=share_link  
or  
https://www.oracle.com/jp/java/technologies/javase/javase8-archive-downloads.html

・JAVA環境変数設定：  
https://www.javadrive.jp/start/install/index4.html

・Git事前設定：  
コマンドプロンプトまたはGit Bashで以下のコマンドを実行  
git config --global user.name 'feichaixiaobao'  
git config --global user.email 'feichaixiaobao@gmail.com'  
※事前にGitのインストールが必要

・ソースコードダウンロード方法  
１）ローカルで任意のフォルダに以下のコマンドを実行  
git clone https://github.com/feichaixiaobao/java_study.git

２）自分のブランチを作成  
git branch 自分のブランチ名

３）自分のブランチに切り替え  
git checkout 自分のブランチ名

４）パッケージ「jp.feichaixiaobao.user」の下に自分のパッケージを作成  
jp.feichaixiaobao.user.xiaobaoを参考

５）タスクのソースを作成  

６）ソースコミット  
①git statusで変更されたファイルを確認。  
例：git status  
②git add <file>で変更されたファイルを追加。  
例：git add src/jp/feichaixiaobao/user/xiaobao/HelloWorld.java  
③git commit -m 'コミットメッセージ'でソースをローカルリポジトリにコミット。  
例：git commit -m 'Add xiaobao sample.'  
④git push --set-upstream origin 自分ブランチ名でリモートリポジトリに反映。  
例：git push --set-upstream origin xiaobao  
 　 ※二回目からgit pushだけで良い
