.class public final Lio/sentry/util/h;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lio/sentry/hints/i;
.implements Lio/sentry/logger/a;


# direct methods
.method public static b(Lio/sentry/s6;Ljava/lang/String;)Z
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p0, 0x0

    .line 9
    :goto_0
    invoke-static {p1, p0}, Lio/sentry/util/h;->c(Ljava/lang/String;Lio/sentry/ILogger;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static c(Ljava/lang/String;Lio/sentry/ILogger;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, p0, v0}, Lio/sentry/util/h;->d(Lio/sentry/ILogger;Ljava/lang/String;Z)Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    return v0
.end method

.method public static d(Lio/sentry/ILogger;Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 2

    .line 1
    :try_start_0
    const-class v0, Lio/sentry/util/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {p1, p2, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    move-exception p2

    .line 13
    goto :goto_0

    .line 14
    :catch_0
    move-exception p2

    .line 15
    goto :goto_1

    .line 16
    :goto_0
    if-eqz p0, :cond_0

    .line 17
    .line 18
    sget-object v0, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 19
    .line 20
    const-string v1, "Failed to initialize "

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p0, v0, p1, p2}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    goto :goto_2

    .line 30
    :goto_1
    if-eqz p0, :cond_0

    .line 31
    .line 32
    sget-object v0, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 33
    .line 34
    const-string v1, "Failed to load (UnsatisfiedLinkError) "

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-interface {p0, v0, p1, p2}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 41
    .line 42
    .line 43
    goto :goto_2

    .line 44
    :catch_1
    if-eqz p0, :cond_0

    .line 45
    .line 46
    sget-object p2, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 47
    .line 48
    const-string v0, "Class not available: "

    .line 49
    .line 50
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    const/4 v0, 0x0

    .line 55
    new-array v0, v0, [Ljava/lang/Object;

    .line 56
    .line 57
    invoke-interface {p0, p2, p1, v0}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    :goto_2
    const/4 p0, 0x0

    .line 61
    return-object p0
.end method


# virtual methods
.method public a(Lio/sentry/android/core/SentryAndroidOptions;Lwg;)Lio/sentry/logger/b;
    .locals 1

    .line 1
    new-instance p0, Lio/sentry/logger/b;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, p2, v0}, Lio/sentry/logger/b;-><init>(Lio/sentry/android/core/SentryAndroidOptions;Lwg;B)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method
