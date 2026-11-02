.class public final Lfy4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ley4;


# instance fields
.field public final X:Landroid/content/Context;

.field public Y:Lm51;

.field public final Z:Lnh5;

.field public f0:Log7;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfy4;->X:Landroid/content/Context;

    .line 5
    .line 6
    new-instance p1, Lnh5;

    .line 7
    .line 8
    const/high16 v0, 0x3f800000    # 1.0f

    .line 9
    .line 10
    invoke-direct {p1, v0}, Lnh5;-><init>(F)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lfy4;->Z:Lnh5;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final B0(Ls61;)Ls61;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final H0(Lr61;)Lq61;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg33;->t(Lq61;Lr61;)Lq61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final U(Lrn2;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p2, p0}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final a0(Lr61;)Ls61;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lg33;->I(Lq61;Lr61;)Ls61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final c0()F
    .locals 10

    .line 1
    iget-object v0, p0, Lfy4;->f0:Log7;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v6, p0, Lfy4;->X:Landroid/content/Context;

    .line 6
    .line 7
    sget-object v8, Lq29;->a:Ls05;

    .line 8
    .line 9
    monitor-enter v8

    .line 10
    :try_start_0
    invoke-virtual {v8, v6}, Ls05;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v9, 0x0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v0, "animator_duration_scale"

    .line 22
    .line 23
    invoke-static {v0}, Landroid/provider/Settings$Global;->getUriFor(Ljava/lang/String;)Landroid/net/Uri;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 v0, -0x1

    .line 28
    const/4 v1, 0x6

    .line 29
    invoke-static {v0, v9, v9, v1}, Lgv3;->b(ILl90;Lgn2;I)Lx90;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lz91;->p(Landroid/os/Looper;)Landroid/os/Handler;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    new-instance v4, Lc81;

    .line 42
    .line 43
    invoke-direct {v4, v5, v0}, Lc81;-><init>(Lx90;Landroid/os/Handler;)V

    .line 44
    .line 45
    .line 46
    new-instance v1, Lkg3;

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    invoke-direct/range {v1 .. v7}, Lkg3;-><init>(Landroid/content/ContentResolver;Landroid/net/Uri;Lc81;Lx90;Landroid/content/Context;Lq51;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Lj31;

    .line 53
    .line 54
    const/4 v2, 0x7

    .line 55
    invoke-direct {v0, v1, v2}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    new-instance v1, Lm51;

    .line 59
    .line 60
    invoke-static {}, Lpw7;->b()Low7;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    sget-object v3, Ltp1;->a:Lnf1;

    .line 65
    .line 66
    sget-object v3, Ldm4;->a:Lhv2;

    .line 67
    .line 68
    invoke-static {v2, v3}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-direct {v1, v2}, Lm51;-><init>(Ls61;)V

    .line 73
    .line 74
    .line 75
    new-instance v2, Lfh7;

    .line 76
    .line 77
    const-wide v3, 0x7fffffffffffffffL

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    invoke-direct {v2, v3, v4}, Lfh7;-><init>(J)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    const-string v4, "animator_duration_scale"

    .line 90
    .line 91
    const/high16 v5, 0x3f800000    # 1.0f

    .line 92
    .line 93
    invoke-static {v3, v4, v5}, Landroid/provider/Settings$Global;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;F)F

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-static {v0, v1, v2, v3}, Ljm4;->a0(Lxe2;Lb71;Li87;Ljava/lang/Object;)Lh76;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v8, v6, v0}, Ls05;->l(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :catchall_0
    move-exception v0

    .line 110
    move-object p0, v0

    .line 111
    goto :goto_1

    .line 112
    :cond_0
    :goto_0
    check-cast v0, Lmh7;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    .line 114
    monitor-exit v8

    .line 115
    invoke-interface {v0}, Lmh7;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, Ljava/lang/Number;

    .line 120
    .line 121
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    iget-object v2, p0, Lfy4;->Z:Lnh5;

    .line 126
    .line 127
    invoke-virtual {v2, v1}, Lnh5;->m(F)V

    .line 128
    .line 129
    .line 130
    iget-object v1, p0, Lfy4;->Y:Lm51;

    .line 131
    .line 132
    if-eqz v1, :cond_1

    .line 133
    .line 134
    new-instance v2, Ljy2;

    .line 135
    .line 136
    const/16 v3, 0xc

    .line 137
    .line 138
    invoke-direct {v2, v0, p0, v9, v3}, Ljy2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 139
    .line 140
    .line 141
    const/4 v0, 0x3

    .line 142
    invoke-static {v1, v9, v9, v2, v0}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iput-object v0, p0, Lfy4;->f0:Log7;

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_1
    const-string p0, "MotionDurationScale scale factor requested before recomposer loop start"

    .line 150
    .line 151
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    const/4 p0, 0x0

    .line 155
    return p0

    .line 156
    :goto_1
    monitor-exit v8

    .line 157
    throw p0

    .line 158
    :cond_2
    :goto_2
    iget-object p0, p0, Lfy4;->Z:Lnh5;

    .line 159
    .line 160
    invoke-virtual {p0}, Lnh5;->l()F

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    return p0
.end method
