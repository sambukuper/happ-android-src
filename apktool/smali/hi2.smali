.class public final Lhi2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfi2;


# instance fields
.field public final a:Lce;

.field public final b:Lxd6;

.field public final c:Lq02;


# direct methods
.method public constructor <init>(Lbe;Lce;)V
    .locals 3

    .line 1
    sget-object p1, Lii2;->a:Lxd6;

    .line 2
    .line 3
    new-instance v0, Lki2;

    .line 4
    .line 5
    sget-object v0, Lki2;->a:Lh71;

    .line 6
    .line 7
    sget-object v1, Lsp1;->a:Lhv2;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    sget-object v1, Lb02;->X:Lb02;

    .line 17
    .line 18
    invoke-interface {v0, v1}, Ls61;->B0(Ls61;)Ls61;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v1, Low7;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-direct {v1, v2}, Ldm3;-><init>(Lbm3;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1}, Ls61;->B0(Ls61;)Ls61;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 33
    .line 34
    .line 35
    new-instance v0, Lq02;

    .line 36
    .line 37
    invoke-direct {v0}, Lq02;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, Lhi2;->a:Lce;

    .line 44
    .line 45
    iput-object p1, p0, Lhi2;->b:Lxd6;

    .line 46
    .line 47
    iput-object v0, p0, Lhi2;->c:Lq02;

    .line 48
    .line 49
    new-instance p1, Ly0;

    .line 50
    .line 51
    const/16 p2, 0x1d

    .line 52
    .line 53
    invoke-direct {p1, p0, p2}, Ly0;-><init>(Ljava/lang/Object;B)V

    .line 54
    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a(Lqj8;)Lrj8;
    .locals 5

    .line 1
    iget-object v0, p0, Lhi2;->b:Lxd6;

    .line 2
    .line 3
    iget-object v1, v0, Lxd6;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lg55;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v2, v0, Lxd6;->Z:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lej4;

    .line 11
    .line 12
    invoke-virtual {v2, p1}, Lej4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    check-cast v2, Lrj8;

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    iget-boolean v3, v2, Lrj8;->Y:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    monitor-exit v1

    .line 25
    return-object v2

    .line 26
    :cond_0
    :try_start_1
    iget-object v2, v0, Lxd6;->Z:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, Lej4;

    .line 29
    .line 30
    invoke-virtual {v2, p1}, Lej4;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    check-cast v2, Lrj8;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p0

    .line 38
    goto/16 :goto_6

    .line 39
    .line 40
    :cond_1
    :goto_0
    monitor-exit v1

    .line 41
    :try_start_2
    iget-object v1, p1, Lqj8;->a:Lgi2;

    .line 42
    .line 43
    iget-object p0, p0, Lhi2;->c:Lq02;

    .line 44
    .line 45
    iget-object p0, p0, Lq02;->Y:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, Lwp5;

    .line 48
    .line 49
    iget v2, p1, Lqj8;->c:I

    .line 50
    .line 51
    iget-object v3, p1, Lqj8;->b:Ldj2;

    .line 52
    .line 53
    if-eqz v1, :cond_5

    .line 54
    .line 55
    instance-of v4, v1, Lqe1;

    .line 56
    .line 57
    if-eqz v4, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    instance-of v4, v1, Liq2;

    .line 61
    .line 62
    if-eqz v4, :cond_3

    .line 63
    .line 64
    check-cast v1, Liq2;

    .line 65
    .line 66
    invoke-interface {p0, v1, v3, v2}, Lwp5;->k(Liq2;Ldj2;I)Landroid/graphics/Typeface;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    instance-of p0, v1, Lwc4;

    .line 72
    .line 73
    if-eqz p0, :cond_4

    .line 74
    .line 75
    check-cast v1, Lwc4;

    .line 76
    .line 77
    iget-object p0, v1, Lwc4;->f:Lyr2;

    .line 78
    .line 79
    iget-object p0, p0, Lyr2;->Y:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, Landroid/graphics/Typeface;

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_4
    const/4 p0, 0x0

    .line 85
    goto :goto_3

    .line 86
    :cond_5
    :goto_1
    invoke-interface {p0, v3, v2}, Lwp5;->d(Ldj2;I)Landroid/graphics/Typeface;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    :goto_2
    new-instance v1, Lrj8;

    .line 91
    .line 92
    invoke-direct {v1, p0}, Lrj8;-><init>(Landroid/graphics/Typeface;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 93
    .line 94
    .line 95
    move-object p0, v1

    .line 96
    :goto_3
    if-eqz p0, :cond_7

    .line 97
    .line 98
    iget-object v1, v0, Lxd6;->Y:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v1, Lg55;

    .line 101
    .line 102
    monitor-enter v1

    .line 103
    :try_start_3
    iget-object v2, v0, Lxd6;->Z:Ljava/lang/Object;

    .line 104
    .line 105
    check-cast v2, Lej4;

    .line 106
    .line 107
    invoke-virtual {v2, p1}, Lej4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-nez v2, :cond_6

    .line 112
    .line 113
    iget-boolean v2, p0, Lrj8;->Y:Z

    .line 114
    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    iget-object v0, v0, Lxd6;->Z:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v0, Lej4;

    .line 120
    .line 121
    invoke-virtual {v0, p1, p0}, Lej4;->b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :catchall_1
    move-exception p0

    .line 126
    goto :goto_5

    .line 127
    :cond_6
    :goto_4
    monitor-exit v1

    .line 128
    return-object p0

    .line 129
    :goto_5
    monitor-exit v1

    .line 130
    throw p0

    .line 131
    :cond_7
    :try_start_4
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 132
    .line 133
    const-string p1, "Could not load font"

    .line 134
    .line 135
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 139
    :catch_0
    move-exception p0

    .line 140
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 141
    .line 142
    const-string v0, "Could not load font"

    .line 143
    .line 144
    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    throw p1

    .line 148
    :goto_6
    monitor-exit v1

    .line 149
    throw p0
.end method

.method public final b(Lgi2;Ldj2;II)Lrj8;
    .locals 6

    .line 1
    new-instance v0, Lqj8;

    .line 2
    .line 3
    iget-object v1, p0, Lhi2;->a:Lce;

    .line 4
    .line 5
    iget v1, v1, Lce;->X:I

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    const v2, 0x7fffffff

    .line 10
    .line 11
    .line 12
    if-ne v1, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget p2, p2, Ldj2;->X:I

    .line 16
    .line 17
    add-int/2addr p2, v1

    .line 18
    const/4 v1, 0x1

    .line 19
    const/16 v2, 0x3e8

    .line 20
    .line 21
    invoke-static {p2, v1, v2}, Lx97;->n(III)I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    new-instance v1, Ldj2;

    .line 26
    .line 27
    invoke-direct {v1, p2}, Ldj2;-><init>(I)V

    .line 28
    .line 29
    .line 30
    move-object v2, v1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    move-object v2, p2

    .line 33
    :goto_1
    const/4 v5, 0x0

    .line 34
    move-object v1, p1

    .line 35
    move v3, p3

    .line 36
    move v4, p4

    .line 37
    invoke-direct/range {v0 .. v5}, Lqj8;-><init>(Lgi2;Ldj2;IILjava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Lhi2;->a(Lqj8;)Lrj8;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
