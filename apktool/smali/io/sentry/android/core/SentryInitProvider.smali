.class public final Lio/sentry/android/core/SentryInitProvider;
.super Lio/sentry/android/core/s0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/sentry/android/core/s0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V
    .locals 2

    .line 1
    const-class v0, Lio/sentry/android/core/SentryInitProvider;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p2, Landroid/content/pm/ProviderInfo;->authority:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-super {p0, p1, p2}, Landroid/content/ContentProvider;->attachInfo(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "An applicationId is required to fulfill the manifest placeholder."

    .line 20
    .line 21
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public final getType(Landroid/net/Uri;)Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public final onCreate()Z
    .locals 5

    .line 1
    new-instance v0, Lio/sentry/android/core/v;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Lio/sentry/android/core/v;-><init>(B)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/ContentProvider;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lio/sentry/s5;->FATAL:Lio/sentry/s5;

    .line 14
    .line 15
    const-string v1, "App. Context from ContentProvider is null"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    new-array v3, v2, [Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {v0, p0, v1, v3}, Lio/sentry/android/core/v;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return v2

    .line 24
    :cond_0
    const/4 v1, 0x1

    .line 25
    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 26
    .line 27
    const/16 v3, 0x21

    .line 28
    .line 29
    if-lt v2, v3, :cond_1

    .line 30
    .line 31
    sget-object v2, Lio/sentry/android/core/m0;->d:Lf51;

    .line 32
    .line 33
    invoke-virtual {v2, p0}, Lf51;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Landroid/content/pm/ApplicationInfo;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    sget-object v2, Lio/sentry/android/core/m0;->e:Lf51;

    .line 41
    .line 42
    invoke-virtual {v2, p0}, Lf51;->a(Landroid/content/Context;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    check-cast v2, Landroid/content/pm/ApplicationInfo;

    .line 47
    .line 48
    :goto_0
    if-eqz v2, :cond_2

    .line 49
    .line 50
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_2
    const/4 v2, 0x0

    .line 54
    :goto_1
    if-eqz v2, :cond_3

    .line 55
    .line 56
    const-string v3, "io.sentry.auto-init"

    .line 57
    .line 58
    invoke-static {v2, v0, v3, v1}, Lio/sentry/android/core/z0;->d(Landroid/os/Bundle;Lio/sentry/ILogger;Ljava/lang/String;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    goto :goto_4

    .line 63
    :catchall_0
    move-exception v2

    .line 64
    goto :goto_3

    .line 65
    :cond_3
    :goto_2
    move v2, v1

    .line 66
    goto :goto_4

    .line 67
    :goto_3
    sget-object v3, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 68
    .line 69
    const-string v4, "Failed to read auto-init from android manifest metadata."

    .line 70
    .line 71
    invoke-virtual {v0, v3, v4, v2}, Lio/sentry/android/core/v;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :goto_4
    if-eqz v2, :cond_6

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const-string v3, ".test"

    .line 82
    .line 83
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-eqz v2, :cond_5

    .line 88
    .line 89
    :try_start_1
    const-string v2, "activity"

    .line 90
    .line 91
    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    check-cast v2, Landroid/app/ActivityManager;

    .line 96
    .line 97
    invoke-virtual {v2}, Landroid/app/ActivityManager;->getAppTasks()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    :cond_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_5

    .line 110
    .line 111
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Landroid/app/ActivityManager$AppTask;

    .line 116
    .line 117
    invoke-virtual {v3}, Landroid/app/ActivityManager$AppTask;->getTaskInfo()Landroid/app/ActivityManager$RecentTaskInfo;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    iget-object v3, v3, Landroid/app/ActivityManager$RecentTaskInfo;->baseIntent:Landroid/content/Intent;

    .line 122
    .line 123
    invoke-virtual {v3}, Landroid/content/Intent;->getComponent()Landroid/content/ComponentName;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    if-eqz v3, :cond_4

    .line 128
    .line 129
    invoke-virtual {v3}, Landroid/content/ComponentName;->getClassName()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    const-string v4, "androidx.compose.ui.tooling.PreviewActivity"

    .line 134
    .line 135
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 139
    if-eqz v3, :cond_4

    .line 140
    .line 141
    goto :goto_5

    .line 142
    :catchall_1
    :cond_5
    new-instance v2, Lio/sentry/c2;

    .line 143
    .line 144
    const/16 v3, 0x16

    .line 145
    .line 146
    invoke-direct {v2, v3}, Lio/sentry/c2;-><init>(B)V

    .line 147
    .line 148
    .line 149
    invoke-static {p0, v0, v2}, Lio/sentry/android/core/s1;->b(Landroid/content/Context;Lio/sentry/android/core/v;Lio/sentry/u4;)V

    .line 150
    .line 151
    .line 152
    invoke-static {}, Lio/sentry/q5;->d()Lio/sentry/q5;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    const-string v0, "AutoInit"

    .line 157
    .line 158
    invoke-virtual {p0, v0}, Lio/sentry/q5;->a(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_6
    :goto_5
    return v1
.end method

.method public final shutdown()V
    .locals 0

    .line 1
    invoke-static {}, Lio/sentry/v4;->a()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
