.class public final synthetic Ley1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 18
    iput-byte p6, p0, Ley1;->X:B

    iput-object p1, p0, Ley1;->Y:Ljava/lang/Object;

    iput-object p2, p0, Ley1;->Z:Ljava/lang/Object;

    iput-object p3, p0, Ley1;->f0:Ljava/lang/Object;

    iput-object p4, p0, Ley1;->g0:Ljava/lang/Object;

    iput-object p5, p0, Ley1;->h0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Landroid/view/View;Ljava/util/List;Ljava/util/concurrent/CountDownLatch;Lio/sentry/ILogger;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Ley1;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ley1;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ley1;->h0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ley1;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Ley1;->f0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Ley1;->g0:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget-byte v0, p0, Ley1;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Ley1;->g0:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Ley1;->f0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, Ley1;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v4, p0, Ley1;->h0:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object p0, p0, Ley1;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    check-cast v4, Landroid/view/View;

    .line 19
    .line 20
    check-cast v3, Ljava/util/List;

    .line 21
    .line 22
    check-cast v2, Ljava/util/concurrent/CountDownLatch;

    .line 23
    .line 24
    check-cast v1, Lio/sentry/ILogger;

    .line 25
    .line 26
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    invoke-direct {v0, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    new-instance v5, Lio/sentry/protocol/j0;

    .line 33
    .line 34
    const-string v6, "android_view_system"

    .line 35
    .line 36
    invoke-direct {v5, v6, v0}, Lio/sentry/protocol/j0;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v4}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->e(Landroid/view/View;)Lio/sentry/protocol/k0;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    invoke-static {v4, v6, v3}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->d(Landroid/view/View;Lio/sentry/protocol/k0;Ljava/util/List;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0, v5}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    move-object p0, v0

    .line 58
    sget-object v0, Lio/sentry/s5;->ERROR:Lio/sentry/s5;

    .line 59
    .line 60
    const-string v2, "Failed to process view hierarchy."

    .line 61
    .line 62
    invoke-interface {v1, v0, v2, p0}, Lio/sentry/ILogger;->e(Lio/sentry/s5;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    :goto_0
    return-void

    .line 66
    :pswitch_0
    check-cast p0, Lra;

    .line 67
    .line 68
    check-cast v3, Ljava/lang/String;

    .line 69
    .line 70
    check-cast v2, Ldn2;

    .line 71
    .line 72
    check-cast v1, Lyz4;

    .line 73
    .line 74
    check-cast v4, Lqd0;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {}, Lln7;->c()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-eqz p0, :cond_1

    .line 84
    .line 85
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    const/16 v5, 0x7f

    .line 90
    .line 91
    if-gt v0, v5, :cond_0

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_0
    const/4 v0, 0x0

    .line 95
    invoke-virtual {v3, v0, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    :goto_1
    invoke-static {v3}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 100
    .line 101
    .line 102
    :cond_1
    :try_start_2
    invoke-interface {v2}, Ldn2;->invoke()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    sget-object v0, Lwl6;->h0:Loc5;

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Lyz4;->k(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v0}, Lqd0;->b(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 111
    .line 112
    .line 113
    goto :goto_2

    .line 114
    :catchall_1
    move-exception v0

    .line 115
    :try_start_3
    new-instance v2, Lmc5;

    .line 116
    .line 117
    invoke-direct {v2, v0}, Lmc5;-><init>(Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v2}, Lyz4;->k(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v0}, Lqd0;->d(Ljava/lang/Throwable;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 124
    .line 125
    .line 126
    :goto_2
    if-eqz p0, :cond_2

    .line 127
    .line 128
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 129
    .line 130
    .line 131
    :cond_2
    return-void

    .line 132
    :catchall_2
    move-exception v0

    .line 133
    if-eqz p0, :cond_3

    .line 134
    .line 135
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 136
    .line 137
    .line 138
    :cond_3
    throw v0

    .line 139
    :pswitch_1
    check-cast p0, Lny1;

    .line 140
    .line 141
    check-cast v3, Le08;

    .line 142
    .line 143
    check-cast v2, Le08;

    .line 144
    .line 145
    check-cast v1, Landroidx/activity/ComponentActivity;

    .line 146
    .line 147
    move-object v5, v4

    .line 148
    check-cast v5, Landroid/view/View;

    .line 149
    .line 150
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object v0, v3, Le08;->a:Lgn2;

    .line 158
    .line 159
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    check-cast v0, Ljava/lang/Boolean;

    .line 171
    .line 172
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    iget-object v0, v2, Le08;->a:Lgn2;

    .line 177
    .line 178
    invoke-virtual {v5}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, Ljava/lang/Boolean;

    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 192
    .line 193
    .line 194
    move-result v7

    .line 195
    move-object v1, v3

    .line 196
    move-object v3, v2

    .line 197
    move-object v2, v1

    .line 198
    move-object v1, p0

    .line 199
    invoke-virtual/range {v1 .. v7}, Lny1;->b(Le08;Le08;Landroid/view/Window;Landroid/view/View;ZZ)V

    .line 200
    .line 201
    .line 202
    return-void

    .line 203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
