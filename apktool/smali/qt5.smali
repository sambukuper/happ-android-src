.class public final Lqt5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ln85;


# instance fields
.field public final a:Laj0;

.field public final b:Lyz4;

.field public c:Lut5;

.field public final d:Ls65;

.field public e:Lyo2;

.field public f:Z


# direct methods
.method public constructor <init>(Laj0;Lyz4;Ls65;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lqt5;->f:Z

    .line 6
    .line 7
    iput-object p1, p0, Lqt5;->a:Laj0;

    .line 8
    .line 9
    iput-object p2, p0, Lqt5;->b:Lyz4;

    .line 10
    .line 11
    iput-object p3, p0, Lqt5;->d:Ls65;

    .line 12
    .line 13
    monitor-enter p0

    .line 14
    :try_start_0
    invoke-virtual {p2}, Lqc4;->d()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    check-cast p1, Lut5;

    .line 19
    .line 20
    iput-object p1, p0, Lqt5;->c:Lut5;

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    throw p1
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 7

    .line 1
    check-cast p1, Lbj0;

    .line 2
    .line 3
    sget-object v0, Lbj0;->g0:Lbj0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    sget-object v2, Lut5;->X:Lut5;

    .line 7
    .line 8
    if-eq p1, v0, :cond_2

    .line 9
    .line 10
    sget-object v0, Lbj0;->Z:Lbj0;

    .line 11
    .line 12
    if-eq p1, v0, :cond_2

    .line 13
    .line 14
    sget-object v0, Lbj0;->Y:Lbj0;

    .line 15
    .line 16
    if-eq p1, v0, :cond_2

    .line 17
    .line 18
    sget-object v0, Lbj0;->X:Lbj0;

    .line 19
    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    .line 22
    goto/16 :goto_1

    .line 23
    .line 24
    :cond_0
    sget-object v0, Lbj0;->h0:Lbj0;

    .line 25
    .line 26
    if-eq p1, v0, :cond_1

    .line 27
    .line 28
    sget-object v0, Lbj0;->i0:Lbj0;

    .line 29
    .line 30
    if-eq p1, v0, :cond_1

    .line 31
    .line 32
    sget-object v0, Lbj0;->f0:Lbj0;

    .line 33
    .line 34
    if-ne p1, v0, :cond_3

    .line 35
    .line 36
    :cond_1
    iget-boolean p1, p0, Lqt5;->f:Z

    .line 37
    .line 38
    if-nez p1, :cond_3

    .line 39
    .line 40
    iget-object p1, p0, Lqt5;->a:Laj0;

    .line 41
    .line 42
    invoke-virtual {p0, v2}, Lqt5;->b(Lut5;)V

    .line 43
    .line 44
    .line 45
    new-instance v0, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v2, "waitForCaptureResult"

    .line 51
    .line 52
    new-instance v3, Lqd0;

    .line 53
    .line 54
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 55
    .line 56
    .line 57
    new-instance v4, Lif6;

    .line 58
    .line 59
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object v4, v3, Lqd0;->c:Lif6;

    .line 63
    .line 64
    new-instance v4, Lud0;

    .line 65
    .line 66
    invoke-direct {v4, v3}, Lud0;-><init>(Lqd0;)V

    .line 67
    .line 68
    .line 69
    iput-object v4, v3, Lqd0;->b:Lud0;

    .line 70
    .line 71
    const-class v5, Lp61;

    .line 72
    .line 73
    iput-object v5, v3, Lqd0;->a:Ljava/lang/Object;

    .line 74
    .line 75
    :try_start_0
    new-instance v5, Lpt5;

    .line 76
    .line 77
    invoke-direct {v5, v3, p1}, Lpt5;-><init>(Lqd0;Lxi0;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    invoke-interface {p1, v6, v5}, Laj0;->r(Ljava/util/concurrent/Executor;Lpt5;)V

    .line 88
    .line 89
    .line 90
    iput-object v2, v3, Lqd0;->a:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :catch_0
    move-exception v2

    .line 94
    invoke-virtual {v4, v2}, Lud0;->b(Ljava/lang/Throwable;)Z

    .line 95
    .line 96
    .line 97
    :goto_0
    invoke-static {v4}, Lyo2;->b(Lxb4;)Lyo2;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    new-instance v3, Lot5;

    .line 102
    .line 103
    invoke-direct {v3, p0}, Lot5;-><init>(Lqt5;)V

    .line 104
    .line 105
    .line 106
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    invoke-static {v2, v3, v4}, Lvr3;->g0(Lxb4;Lvu;Ljava/util/concurrent/Executor;)Lzo0;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    new-instance v3, Lot5;

    .line 115
    .line 116
    invoke-direct {v3, p0}, Lot5;-><init>(Lqt5;)V

    .line 117
    .line 118
    .line 119
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 120
    .line 121
    .line 122
    move-result-object v4

    .line 123
    new-instance v5, Lvk1;

    .line 124
    .line 125
    const/16 v6, 0xd

    .line 126
    .line 127
    invoke-direct {v5, v3, v6}, Lvk1;-><init>(Ljava/lang/Object;B)V

    .line 128
    .line 129
    .line 130
    invoke-static {v2, v5, v4}, Lvr3;->g0(Lxb4;Lvu;Ljava/util/concurrent/Executor;)Lzo0;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    iput-object v2, p0, Lqt5;->e:Lyo2;

    .line 135
    .line 136
    new-instance v3, Lf63;

    .line 137
    .line 138
    invoke-direct {v3, p0, v0, p1}, Lf63;-><init>(Lqt5;Ljava/util/ArrayList;Lxi0;)V

    .line 139
    .line 140
    .line 141
    invoke-static {}, Ldp1;->a()Ldp1;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    new-instance v0, Lzo2;

    .line 146
    .line 147
    invoke-direct {v0, v2, v3, v1}, Lzo2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v2, v0, p1}, Lyo2;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 151
    .line 152
    .line 153
    const/4 p1, 0x1

    .line 154
    iput-boolean p1, p0, Lqt5;->f:Z

    .line 155
    .line 156
    return-void

    .line 157
    :cond_2
    :goto_1
    invoke-virtual {p0, v2}, Lqt5;->b(Lut5;)V

    .line 158
    .line 159
    .line 160
    iget-boolean p1, p0, Lqt5;->f:Z

    .line 161
    .line 162
    if-eqz p1, :cond_3

    .line 163
    .line 164
    iput-boolean v1, p0, Lqt5;->f:Z

    .line 165
    .line 166
    iget-object p1, p0, Lqt5;->e:Lyo2;

    .line 167
    .line 168
    if-eqz p1, :cond_3

    .line 169
    .line 170
    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 171
    .line 172
    .line 173
    const/4 p1, 0x0

    .line 174
    iput-object p1, p0, Lqt5;->e:Lyo2;

    .line 175
    .line 176
    :cond_3
    return-void
.end method

.method public final b(Lut5;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lqt5;->c:Lut5;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iput-object p1, p0, Lqt5;->c:Lut5;

    .line 15
    .line 16
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    const-string v0, "StreamStateObserver"

    .line 18
    .line 19
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    iget-object p0, p0, Lqt5;->b:Lyz4;

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lyz4;->k(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :goto_0
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    throw p1
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lqt5;->e:Lyo2;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-interface {p1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lqt5;->e:Lyo2;

    .line 11
    .line 12
    :cond_0
    sget-object p1, Lut5;->X:Lut5;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lqt5;->b(Lut5;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
