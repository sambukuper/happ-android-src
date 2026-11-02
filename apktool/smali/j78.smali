.class public final synthetic Lj78;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Luz7;
.implements Lfa5;
.implements Lzw7;
.implements Lp63;
.implements Lokhttp3/EventListener$Factory;
.implements Lio/sentry/g7;
.implements Lio/sentry/l4;
.implements Lio/sentry/android/core/w1;
.implements Lj6;
.implements Lio/sentry/util/f;
.implements Lio/sentry/g4;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lj78;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lj78;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 9
    iput-byte p3, p0, Lj78;->X:B

    iput-object p2, p0, Lj78;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/sentry/b4;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lj78;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/g1;

    .line 4
    .line 5
    new-instance p1, Lio/sentry/b4;

    .line 6
    .line 7
    invoke-direct {p1}, Lio/sentry/b4;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, p1}, Lio/sentry/g1;->K(Lio/sentry/b4;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    iget-object p0, p0, Lj78;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/android/core/FeedbackShakeIntegration;

    .line 4
    .line 5
    iget-object v0, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->g0:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroid/app/Activity;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    sget-object v1, Lio/sentry/android/core/g0;->g0:Lio/sentry/android/core/g0;

    .line 18
    .line 19
    iget-object v1, v1, Lio/sentry/android/core/g0;->f0:Ljava/lang/Boolean;

    .line 20
    .line 21
    if-eqz v0, :cond_2

    .line 22
    .line 23
    iget-object v2, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->Z:Lio/sentry/android/core/SentryAndroidOptions;

    .line 24
    .line 25
    if-eqz v2, :cond_2

    .line 26
    .line 27
    iget-boolean v2, p0, Lio/sentry/android/core/FeedbackShakeIntegration;->f0:Z

    .line 28
    .line 29
    if-eqz v2, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lio/sentry/android/core/FeedbackShakeIntegration;->g(Landroid/app/Activity;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 38
    .line 39
    invoke-virtual {v2, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    new-instance v1, Lsc4;

    .line 47
    .line 48
    const/16 v2, 0x1c

    .line 49
    .line 50
    invoke-direct {v1, p0, v0, v2}, Lsc4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    :cond_2
    :goto_1
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-object p0, p0, Lj78;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/android/core/e;

    .line 4
    .line 5
    move-object v1, p1

    .line 6
    check-cast v1, Landroid/net/Uri;

    .line 7
    .line 8
    if-eqz v1, :cond_3

    .line 9
    .line 10
    iget-object p1, p0, Lio/sentry/android/core/e;->X:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lio/sentry/android/core/c2;

    .line 13
    .line 14
    iget-object v0, p0, Lio/sentry/android/core/e;->Y:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v6, v0

    .line 17
    check-cast v6, Lio/sentry/s6;

    .line 18
    .line 19
    iget-object p0, p0, Lio/sentry/android/core/e;->Z:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroid/widget/Button;

    .line 22
    .line 23
    iget-object v7, p1, Lio/sentry/android/core/c2;->f0:Lio/sentry/n5;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    const/4 v2, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    :try_start_0
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 38
    .line 39
    .line 40
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    if-eqz v2, :cond_0

    .line 42
    .line 43
    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_0

    .line 48
    .line 49
    const-string v0, "_size"

    .line 50
    .line 51
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    const/4 v3, -0x1

    .line 56
    if-eq v0, v3, :cond_0

    .line 57
    .line 58
    invoke-interface {v2, v0}, Landroid/database/Cursor;->isNull(I)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-nez v3, :cond_0

    .line 63
    .line 64
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 65
    .line 66
    .line 67
    move-result-wide v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 68
    :try_start_2
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 69
    .line 70
    .line 71
    goto :goto_3

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    goto :goto_1

    .line 74
    :catchall_1
    move-exception v0

    .line 75
    move-object v3, v0

    .line 76
    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_2
    move-exception v0

    .line 81
    :try_start_4
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    :goto_0
    throw v3

    .line 85
    :cond_0
    if-eqz v2, :cond_1

    .line 86
    .line 87
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :goto_1
    invoke-static {v0}, Lio/sentry/util/b;->t(Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v6}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    sget-object v3, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 99
    .line 100
    const-string v4, "Unable to determine the size of the selected screenshot, the attachment size limit is applied when the feedback is captured."

    .line 101
    .line 102
    invoke-interface {v2, v3, v4, v0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    :cond_1
    :goto_2
    const-wide/16 v3, -0x1

    .line 106
    .line 107
    :goto_3
    invoke-virtual {v6}, Lio/sentry/s6;->getMaxAttachmentSize()J

    .line 108
    .line 109
    .line 110
    move-result-wide v8

    .line 111
    cmp-long v0, v3, v8

    .line 112
    .line 113
    if-lez v0, :cond_2

    .line 114
    .line 115
    invoke-virtual {v6}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    sget-object v0, Lio/sentry/s5;->WARNING:Lio/sentry/s5;

    .line 120
    .line 121
    invoke-virtual {v6}, Lio/sentry/s6;->getMaxAttachmentSize()J

    .line 122
    .line 123
    .line 124
    move-result-wide v1

    .line 125
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    const-string v2, "Selected screenshot is larger than the maxAttachmentSize of %d bytes, dropping it."

    .line 134
    .line 135
    invoke-interface {p0, v0, v2, v1}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    const-string p1, "Screenshot is too large"

    .line 146
    .line 147
    const/4 v0, 0x0

    .line 148
    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 153
    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_2
    iput-object v1, p1, Lio/sentry/android/core/c2;->j0:Landroid/net/Uri;

    .line 157
    .line 158
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    const-string p1, "Remove screenshot"

    .line 162
    .line 163
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    :cond_3
    :goto_4
    return-void
.end method

.method public create(Lokhttp3/Call;)Lokhttp3/EventListener;
    .locals 0

    .line 1
    iget-object p0, p0, Lj78;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lokhttp3/EventListener;

    .line 4
    .line 5
    invoke-static {p0, p1}, Lokhttp3/internal/_UtilJvmKt;->b(Lokhttp3/EventListener;Lokhttp3/Call;)Lokhttp3/EventListener;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public d(Lio/sentry/e7;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lj78;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lio/sentry/b7;

    .line 4
    .line 5
    iget-object v0, p0, Lio/sentry/b7;->q:Lio/sentry/o;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0, p1}, Lio/sentry/o;->b(Lio/sentry/e7;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lio/sentry/b7;->f:Lio/sentry/a7;

    .line 13
    .line 14
    iget-object v0, p0, Lio/sentry/b7;->r:Lio/sentry/o7;

    .line 15
    .line 16
    iget-object v1, v0, Lio/sentry/o7;->g:Ljava/lang/Long;

    .line 17
    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    iget-boolean p1, v0, Lio/sentry/o7;->f:Z

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object p1, p0, Lio/sentry/b7;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->listIterator()Ljava/util/ListIterator;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    :cond_1
    invoke-interface {p1}, Ljava/util/ListIterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-interface {p1}, Ljava/util/ListIterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lio/sentry/e7;

    .line 41
    .line 42
    iget-boolean v1, v0, Lio/sentry/e7;->f:Z

    .line 43
    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    iget-object v0, v0, Lio/sentry/e7;->b:Lio/sentry/a5;

    .line 47
    .line 48
    if-nez v0, :cond_1

    .line 49
    .line 50
    return-void

    .line 51
    :cond_2
    invoke-virtual {p0}, Lio/sentry/b7;->q()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_3
    iget-boolean v0, p1, Lio/sentry/a7;->a:Z

    .line 56
    .line 57
    if-eqz v0, :cond_4

    .line 58
    .line 59
    iget-object p1, p1, Lio/sentry/a7;->b:Lio/sentry/j7;

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-virtual {p0, p1, v0}, Lio/sentry/b7;->v(Lio/sentry/j7;Lio/sentry/a5;)V

    .line 63
    .line 64
    .line 65
    :cond_4
    return-void
.end method

.method public e()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Lj78;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lj78;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    sparse-switch v0, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "androidx.core.app.FrameMetricsAggregator"

    .line 9
    .line 10
    check-cast p0, Lio/sentry/ILogger;

    .line 11
    .line 12
    invoke-static {v0, p0}, Lio/sentry/util/h;->c(Ljava/lang/String;Lio/sentry/ILogger;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :sswitch_0
    check-cast p0, Lio/sentry/cache/g;

    .line 22
    .line 23
    iget-object v0, p0, Lio/sentry/cache/g;->a:Lio/sentry/s6;

    .line 24
    .line 25
    const-string v1, ".scope-cache"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lio/sentry/cache/a;->b(Lio/sentry/s6;Ljava/lang/String;)Ljava/io/File;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/4 v2, 0x0

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    invoke-virtual {v0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget-object v0, Lio/sentry/s5;->INFO:Lio/sentry/s5;

    .line 39
    .line 40
    const-string v1, "Cache dir is not set, cannot store in scope cache"

    .line 41
    .line 42
    new-array v2, v2, [Ljava/lang/Object;

    .line 43
    .line 44
    invoke-interface {p0, v0, v1, v2}, Lio/sentry/ILogger;->h(Lio/sentry/s5;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance p0, Lio/sentry/cache/tape/b;

    .line 48
    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_0
    new-instance v3, Ljava/io/File;

    .line 54
    .line 55
    const-string v4, "breadcrumbs.json"

    .line 56
    .line 57
    invoke-direct {v3, v1, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    :try_start_0
    invoke-virtual {v0}, Lio/sentry/s6;->getMaxBreadcrumbs()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    invoke-static {v3, v2}, Lio/sentry/cache/tape/j;->R(Ljava/io/File;Z)Ljava/io/RandomAccessFile;

    .line 65
    .line 66
    .line 67
    move-result-object v4
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    :try_start_1
    new-instance v5, Lio/sentry/cache/tape/j;

    .line 69
    .line 70
    invoke-direct {v5, v3, v4, v1, v2}, Lio/sentry/cache/tape/j;-><init>(Ljava/io/File;Ljava/io/RandomAccessFile;IZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :catchall_0
    move-exception v1

    .line 75
    :try_start_2
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    .line 76
    .line 77
    .line 78
    throw v1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 79
    :catch_0
    :try_start_3
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Lio/sentry/s6;->getMaxBreadcrumbs()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    invoke-static {v3, v2}, Lio/sentry/cache/tape/j;->R(Ljava/io/File;Z)Ljava/io/RandomAccessFile;

    .line 87
    .line 88
    .line 89
    move-result-object v4
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 90
    :try_start_4
    new-instance v5, Lio/sentry/cache/tape/j;

    .line 91
    .line 92
    invoke-direct {v5, v3, v4, v1, v2}, Lio/sentry/cache/tape/j;-><init>(Ljava/io/File;Ljava/io/RandomAccessFile;IZ)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 93
    .line 94
    .line 95
    :goto_0
    new-instance v0, Lio/sentry/d;

    .line 96
    .line 97
    const/16 v1, 0x8

    .line 98
    .line 99
    invoke-direct {v0, p0, v1}, Lio/sentry/d;-><init>(Ljava/lang/Object;B)V

    .line 100
    .line 101
    .line 102
    new-instance p0, Lio/sentry/cache/tape/e;

    .line 103
    .line 104
    invoke-direct {p0, v5, v0}, Lio/sentry/cache/tape/e;-><init>(Lio/sentry/cache/tape/j;Lio/sentry/cache/tape/f;)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :catchall_1
    move-exception p0

    .line 109
    :try_start_5
    invoke-virtual {v4}, Ljava/io/RandomAccessFile;->close()V

    .line 110
    .line 111
    .line 112
    throw p0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_1

    .line 113
    :catch_1
    move-exception p0

    .line 114
    invoke-virtual {v0}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sget-object v1, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 119
    .line 120
    const-string v2, "Failed to create breadcrumbs queue"

    .line 121
    .line 122
    invoke-interface {v0, v1, v2, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    new-instance p0, Lio/sentry/cache/tape/b;

    .line 126
    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 128
    .line 129
    .line 130
    :goto_1
    return-object p0

    .line 131
    :sswitch_1
    check-cast p0, Lio/sentry/cache/c;

    .line 132
    .line 133
    iget-object p0, p0, Lio/sentry/cache/c;->X:Lio/sentry/s6;

    .line 134
    .line 135
    invoke-virtual {p0}, Lio/sentry/s6;->getSerializer()Lio/sentry/o1;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    return-object p0

    .line 140
    :sswitch_2
    check-cast p0, Lio/sentry/l5;

    .line 141
    .line 142
    sget v0, Lio/sentry/android/core/SentryPerformanceProvider;->h0:I

    .line 143
    .line 144
    return-object p0

    .line 145
    :sswitch_data_0
    .sparse-switch
        0x11 -> :sswitch_2
        0x17 -> :sswitch_1
        0x18 -> :sswitch_0
    .end sparse-switch
.end method

.method public execute()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Lj78;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lj78;->Y:Ljava/lang/Object;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p0, Lyr6;

    .line 10
    .line 11
    iget-object v0, p0, Lyr6;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lwr6;

    .line 14
    .line 15
    new-instance v2, Lkp5;

    .line 16
    .line 17
    const/16 v3, 0x12

    .line 18
    .line 19
    invoke-direct {v2, v3}, Lkp5;-><init>(B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lwr6;->m(Lur6;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Ljava/lang/Iterable;

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lqz;

    .line 43
    .line 44
    iget-object v3, p0, Lyr6;->f0:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v3, Lf63;

    .line 47
    .line 48
    const/4 v4, 0x1

    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-virtual {v3, v2, v4, v5}, Lf63;->z(Lqz;IZ)V

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    return-object v1

    .line 55
    :pswitch_0
    check-cast p0, Ljl1;

    .line 56
    .line 57
    iget-object p0, p0, Ljl1;->k0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Lwr6;

    .line 60
    .line 61
    invoke-virtual {p0}, Lwr6;->g()Landroid/database/sqlite/SQLiteDatabase;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 66
    .line 67
    .line 68
    :try_start_0
    const-string v2, "DELETE FROM log_event_dropped"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v2}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 75
    .line 76
    .line 77
    new-instance v2, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v3, "UPDATE global_log_event_state SET last_metrics_upload_ms="

    .line 80
    .line 81
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    iget-object p0, p0, Lwr6;->Y:Lf08;

    .line 85
    .line 86
    invoke-virtual {p0}, Lf08;->j()J

    .line 87
    .line 88
    .line 89
    move-result-wide v3

    .line 90
    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {v0, p0}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteStatement;->execute()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 108
    .line 109
    .line 110
    return-object v1

    .line 111
    :catchall_0
    move-exception p0

    .line 112
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 113
    .line 114
    .line 115
    throw p0

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lyw7;)Lax7;
    .locals 6

    .line 1
    iget-object p0, p0, Lj78;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    check-cast v1, Landroid/content/Context;

    .line 5
    .line 6
    iget-object v2, p1, Lyw7;->b:Ljava/lang/String;

    .line 7
    .line 8
    iget-object v3, p1, Lyw7;->c:Lb8;

    .line 9
    .line 10
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    new-instance v0, Lxm2;

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    move v5, v4

    .line 25
    invoke-direct/range {v0 .. v5}, Lxm2;-><init>(Landroid/content/Context;Ljava/lang/String;Lb8;ZZ)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    const-string p0, "Must set a non-null database name to a configuration that uses the no backup directory."

    .line 30
    .line 31
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public h(Lio/sentry/g1;)V
    .locals 4

    .line 1
    iget-byte v0, p0, Lj78;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lj78;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    check-cast p0, Lio/sentry/android/replay/capture/m;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lio/sentry/android/replay/capture/c;->d()Lio/sentry/protocol/w;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-interface {p1, v0}, Lio/sentry/g1;->h(Lio/sentry/protocol/w;)V

    .line 18
    .line 19
    .line 20
    invoke-interface {p1}, Lio/sentry/g1;->C()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/16 v0, 0x2e

    .line 27
    .line 28
    invoke-static {v0, p1, p1}, Lfm7;->K0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    :goto_0
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->l:Lio/sentry/android/replay/capture/a;

    .line 35
    .line 36
    sget-object v0, Lio/sentry/android/replay/capture/c;->u:[Lnw3;

    .line 37
    .line 38
    const/4 v1, 0x2

    .line 39
    aget-object v0, v0, v1

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lio/sentry/android/replay/capture/a;->b:Ljava/util/concurrent/atomic/AtomicReference;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0, p1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_2

    .line 58
    .line 59
    new-instance v2, Lio/sentry/android/replay/capture/b;

    .line 60
    .line 61
    iget-object v3, p0, Lio/sentry/android/replay/capture/a;->d:Lio/sentry/android/replay/capture/c;

    .line 62
    .line 63
    invoke-direct {v2, v0, p1, v3, v1}, Lio/sentry/android/replay/capture/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;B)V

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, Lio/sentry/android/replay/capture/a;->c:Lio/sentry/android/replay/capture/c;

    .line 67
    .line 68
    iget-object p1, p0, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/s6;

    .line 69
    .line 70
    invoke-virtual {p1}, Lio/sentry/s6;->getThreadChecker()Lio/sentry/util/thread/a;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v0}, Lio/sentry/util/thread/a;->c()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    iget-object p0, p0, Lio/sentry/android/replay/capture/c;->e:Ljava/util/concurrent/ScheduledExecutorService;

    .line 81
    .line 82
    new-instance p1, Lio/sentry/android/replay/util/h;

    .line 83
    .line 84
    new-instance v0, Lio/sentry/t2;

    .line 85
    .line 86
    const/4 v1, 0x7

    .line 87
    invoke-direct {v0, v2, v1}, Lio/sentry/t2;-><init>(Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    const-string v1, "CaptureStrategy.runInBackground"

    .line 91
    .line 92
    invoke-direct {p1, v0, v1}, Lio/sentry/android/replay/util/h;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    :try_start_0
    invoke-virtual {v2}, Lio/sentry/android/replay/capture/b;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :catchall_0
    move-exception p0

    .line 104
    invoke-virtual {p1}, Lio/sentry/s6;->getLogger()Lio/sentry/ILogger;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    sget-object v0, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 109
    .line 110
    const-string v1, "Failed to execute task CaptureStrategy.runInBackground"

    .line 111
    .line 112
    invoke-interface {p1, v0, v1, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    :cond_2
    :goto_1
    return-void

    .line 116
    :pswitch_1
    check-cast p0, Lio/sentry/protocol/w;

    .line 117
    .line 118
    sget v0, Lio/sentry/android/replay/ReplayIntegration;->r0:I

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-interface {p1}, Lio/sentry/g1;->g()Lio/sentry/protocol/w;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    invoke-static {v0, p0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    if-eqz p0, :cond_3

    .line 132
    .line 133
    sget-object p0, Lio/sentry/protocol/w;->Y:Lio/sentry/protocol/w;

    .line 134
    .line 135
    invoke-interface {p1, p0}, Lio/sentry/g1;->h(Lio/sentry/protocol/w;)V

    .line 136
    .line 137
    .line 138
    :cond_3
    return-void

    .line 139
    :pswitch_2
    check-cast p0, Lio/sentry/android/replay/p;

    .line 140
    .line 141
    sget v0, Lio/sentry/android/replay/ReplayIntegration;->r0:I

    .line 142
    .line 143
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object p0, p0, Lio/sentry/android/replay/p;->c:Lio/sentry/protocol/w;

    .line 147
    .line 148
    invoke-interface {p1, p0}, Lio/sentry/g1;->h(Lio/sentry/protocol/w;)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    :pswitch_3
    check-cast p0, [Lio/sentry/s1;

    .line 153
    .line 154
    const/4 v0, 0x0

    .line 155
    invoke-interface {p1}, Lio/sentry/g1;->j()Lio/sentry/s1;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    aput-object p1, p0, v0

    .line 160
    .line 161
    return-void

    .line 162
    :pswitch_4
    check-cast p0, Lio/sentry/android/core/internal/gestures/g;

    .line 163
    .line 164
    new-instance v0, Ljn0;

    .line 165
    .line 166
    const/16 v1, 0x19

    .line 167
    .line 168
    invoke-direct {v0, p0, p1, v1}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 169
    .line 170
    .line 171
    invoke-interface {p1, v0}, Lio/sentry/g1;->D(Lio/sentry/i4;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :pswitch_5
    check-cast p0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 176
    .line 177
    invoke-interface {p1}, Lio/sentry/g1;->p()Lio/sentry/d7;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-eqz p1, :cond_4

    .line 182
    .line 183
    const/4 p1, 0x1

    .line 184
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 185
    .line 186
    .line 187
    :cond_4
    return-void

    .line 188
    :pswitch_6
    check-cast p0, Lio/sentry/android/core/y0;

    .line 189
    .line 190
    iget-object p0, p0, Lio/sentry/android/core/y0;->X:Ljava/util/concurrent/atomic/AtomicLong;

    .line 191
    .line 192
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 193
    .line 194
    .line 195
    move-result-wide v0

    .line 196
    const-wide/16 v2, 0x0

    .line 197
    .line 198
    cmp-long v0, v0, v2

    .line 199
    .line 200
    if-nez v0, :cond_5

    .line 201
    .line 202
    invoke-interface {p1}, Lio/sentry/g1;->p()Lio/sentry/d7;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    if-eqz p1, :cond_5

    .line 207
    .line 208
    iget-object p1, p1, Lio/sentry/d7;->X:Ljava/util/Date;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicLong;->set(J)V

    .line 215
    .line 216
    .line 217
    :cond_5
    return-void

    .line 218
    :pswitch_7
    check-cast p0, Lio/sentry/s1;

    .line 219
    .line 220
    new-instance v0, Ljn0;

    .line 221
    .line 222
    const/16 v1, 0x14

    .line 223
    .line 224
    invoke-direct {v0, p0, p1, v1}, Ljn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 225
    .line 226
    .line 227
    invoke-interface {p1, v0}, Lio/sentry/g1;->D(Lio/sentry/i4;)V

    .line 228
    .line 229
    .line 230
    return-void

    .line 231
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public i(Lfb9;)V
    .locals 0

    .line 1
    iget-byte p1, p0, Lj78;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lj78;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/util/concurrent/ScheduledFuture;

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-interface {p0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_0
    check-cast p0, Li39;

    .line 16
    .line 17
    iget-object p0, p0, Li39;->b:Lz18;

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    invoke-virtual {p0, p1}, Lz18;->c(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    check-cast p0, Landroid/content/Intent;

    .line 25
    .line 26
    invoke-static {p0}, Li21;->p(Landroid/content/Intent;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public k(Lq63;)V
    .locals 4

    .line 1
    iget-object p0, p0, Lj78;->Y:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lu79;

    .line 4
    .line 5
    :try_start_0
    invoke-interface {p1}, Lq63;->d()Ln63;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_6

    .line 10
    .line 11
    iget-object p0, p0, Lu79;->c:Lxd6;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ln63;->r0()Ld63;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    instance-of v1, v0, Leh0;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    check-cast v0, Leh0;

    .line 26
    .line 27
    iget-object v0, v0, Leh0;->a:Ldh0;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v0, v2

    .line 31
    :goto_0
    if-nez v0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    invoke-interface {v0}, Ldh0;->e()Lbh0;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    sget-object v3, Lbh0;->h0:Lbh0;

    .line 39
    .line 40
    if-eq v1, v3, :cond_2

    .line 41
    .line 42
    invoke-interface {v0}, Ldh0;->e()Lbh0;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    sget-object v3, Lbh0;->f0:Lbh0;

    .line 47
    .line 48
    if-eq v1, v3, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-interface {v0}, Ldh0;->d()Lah0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    sget-object v3, Lah0;->g0:Lah0;

    .line 56
    .line 57
    if-eq v1, v3, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-interface {v0}, Ldh0;->c()Lch0;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    sget-object v1, Lch0;->f0:Lch0;

    .line 65
    .line 66
    if-eq v0, v1, :cond_4

    .line 67
    .line 68
    :goto_1
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_4
    iget-object v0, p0, Lxd6;->Z:Ljava/lang/Object;

    .line 73
    .line 74
    monitor-enter v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    :try_start_1
    iget-object v1, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Ljava/util/ArrayDeque;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    const/4 v3, 0x3

    .line 84
    if-lt v1, v3, :cond_5

    .line 85
    .line 86
    invoke-virtual {p0}, Lxd6;->l()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    goto :goto_2

    .line 91
    :catchall_0
    move-exception p0

    .line 92
    goto :goto_3

    .line 93
    :cond_5
    :goto_2
    iget-object p0, p0, Lxd6;->Y:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast p0, Ljava/util/ArrayDeque;

    .line 96
    .line 97
    invoke-virtual {p0, p1}, Ljava/util/ArrayDeque;->addFirst(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    if-eqz v2, :cond_6

    .line 102
    .line 103
    :try_start_2
    check-cast v2, Ln63;

    .line 104
    .line 105
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V
    :try_end_2
    .catch Ljava/lang/IllegalStateException; {:try_start_2 .. :try_end_2} :catch_0

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :goto_3
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 110
    :try_start_4
    throw p0
    :try_end_4
    .catch Ljava/lang/IllegalStateException; {:try_start_4 .. :try_end_4} :catch_0

    .line 111
    :cond_6
    return-void

    .line 112
    :catch_0
    invoke-static {}, Lhi5;->j0()Z

    .line 113
    .line 114
    .line 115
    return-void
.end method
