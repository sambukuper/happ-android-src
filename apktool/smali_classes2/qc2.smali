.class public final Lqc2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final synthetic l:[Lnw3;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljs5;

.field public final c:Ljs5;

.field public final d:Ljs5;

.field public final e:Ljs5;

.field public final f:Lis5;

.field public final g:Lcc2;

.field public final h:Lh76;

.field public final i:Lxe2;

.field public final j:Lxe2;

.field public final k:Lxe2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lmx5;

    .line 2
    .line 3
    const-class v1, Lqc2;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmx5;-><init>(Ljava/lang/Class;)V

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    new-array v1, v1, [Lnw3;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    aput-object v0, v1, v2

    .line 13
    .line 14
    sput-object v1, Lqc2;->l:[Lnw3;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lqc2;->a:Landroid/content/Context;

    .line 5
    .line 6
    new-instance v0, Ljs5;

    .line 7
    .line 8
    const-string v1, "remote_messages"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljs5;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lqc2;->b:Ljs5;

    .line 14
    .line 15
    new-instance v0, Ljs5;

    .line 16
    .line 17
    const-string v1, "token"

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljs5;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lqc2;->c:Ljs5;

    .line 23
    .line 24
    new-instance v0, Ljs5;

    .line 25
    .line 26
    const-string v1, "provider_ids"

    .line 27
    .line 28
    invoke-direct {v0, v1}, Ljs5;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lqc2;->d:Ljs5;

    .line 32
    .line 33
    new-instance v0, Ljs5;

    .line 34
    .line 35
    const-string v1, "last_token_send_timestamp"

    .line 36
    .line 37
    invoke-direct {v0, v1}, Ljs5;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lqc2;->e:Ljs5;

    .line 41
    .line 42
    const/16 v0, 0xe

    .line 43
    .line 44
    const-string v1, "messaging"

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-static {v1, v2, v2, v0}, Lx97;->R(Ljava/lang/String;Llr5;Lvj2;I)Lis5;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iput-object v0, p0, Lqc2;->f:Lis5;

    .line 52
    .line 53
    invoke-virtual {p0, p1}, Lqc2;->d(Landroid/content/Context;)Lna1;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0}, Lna1;->j()Lxe2;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    new-instance v1, Lcc2;

    .line 62
    .line 63
    const/4 v3, 0x0

    .line 64
    invoke-direct {v1, v0, p0, v3}, Lcc2;-><init>(Lxe2;Lqc2;B)V

    .line 65
    .line 66
    .line 67
    iput-object v1, p0, Lqc2;->g:Lcc2;

    .line 68
    .line 69
    new-instance v0, Lj31;

    .line 70
    .line 71
    const/4 v3, 0x1

    .line 72
    invoke-direct {v0, v1, v3}, Lj31;-><init>(Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Lw51;->t(Lxe2;)Lxe2;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sget-object v1, Lsu/happ/proxyutility/HappApplication;->N0:Lm51;

    .line 80
    .line 81
    sget-object v4, Lh87;->a:Lg55;

    .line 82
    .line 83
    invoke-static {v0, v1, v4, v2}, Ljm4;->a0(Lxe2;Lb71;Li87;Ljava/lang/Object;)Lh76;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    iput-object v0, p0, Lqc2;->h:Lh76;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, Lqc2;->d(Landroid/content/Context;)Lna1;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-interface {v0}, Lna1;->j()Lxe2;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v1, Lcc2;

    .line 98
    .line 99
    invoke-direct {v1, v0, p0, v3}, Lcc2;-><init>(Lxe2;Lqc2;B)V

    .line 100
    .line 101
    .line 102
    invoke-static {v1}, Lw51;->t(Lxe2;)Lxe2;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iput-object v0, p0, Lqc2;->i:Lxe2;

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Lqc2;->d(Landroid/content/Context;)Lna1;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-interface {v0}, Lna1;->j()Lxe2;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    new-instance v1, Lcc2;

    .line 117
    .line 118
    const/4 v2, 0x2

    .line 119
    invoke-direct {v1, v0, p0, v2}, Lcc2;-><init>(Lxe2;Lqc2;B)V

    .line 120
    .line 121
    .line 122
    invoke-static {v1}, Lw51;->t(Lxe2;)Lxe2;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    iput-object v0, p0, Lqc2;->j:Lxe2;

    .line 127
    .line 128
    invoke-virtual {p0, p1}, Lqc2;->d(Landroid/content/Context;)Lna1;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-interface {p1}, Lna1;->j()Lxe2;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    new-instance v0, Lcc2;

    .line 137
    .line 138
    const/4 v1, 0x3

    .line 139
    invoke-direct {v0, p1, p0, v1}, Lcc2;-><init>(Lxe2;Lqc2;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {v0}, Lw51;->t(Lxe2;)Lxe2;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iput-object p1, p0, Lqc2;->k:Lxe2;

    .line 147
    .line 148
    return-void
.end method


# virtual methods
.method public final a(Lld6;Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lub2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lub2;

    .line 7
    .line 8
    iget v1, v0, Lub2;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lub2;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lub2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lub2;-><init>(Lqc2;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lub2;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lub2;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p0, Lqc2;->a:Landroid/content/Context;

    .line 49
    .line 50
    invoke-virtual {p0, p2}, Lqc2;->d(Landroid/content/Context;)Lna1;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    new-instance v1, Lco;

    .line 55
    .line 56
    const/4 v4, 0x2

    .line 57
    invoke-direct {v1, p0, p1, v2, v4}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 58
    .line 59
    .line 60
    iput v3, v0, Lub2;->h0:I

    .line 61
    .line 62
    invoke-static {p2, v1, v0}, Lwl7;->x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    sget-object p1, Lc71;->X:Lc71;

    .line 67
    .line 68
    if-ne p0, p1, :cond_3

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_3
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 72
    .line 73
    return-object p0
.end method

.method public final b(Ls51;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, Lvb2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lvb2;

    .line 7
    .line 8
    iget v1, v0, Lvb2;->i0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lvb2;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lvb2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lvb2;-><init>(Lqc2;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lvb2;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lvb2;->i0:I

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    sget-object v5, Lc71;->X:Lc71;

    .line 33
    .line 34
    if-eqz v1, :cond_3

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-ne v1, v2, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v4

    .line 50
    :cond_2
    iget-object p0, v0, Lvb2;->f0:Lux0;

    .line 51
    .line 52
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    new-instance p1, Lux0;

    .line 60
    .line 61
    invoke-direct {p1}, Lux0;-><init>()V

    .line 62
    .line 63
    .line 64
    iget-object v1, p0, Lqc2;->a:Landroid/content/Context;

    .line 65
    .line 66
    invoke-virtual {p0, v1}, Lqc2;->d(Landroid/content/Context;)Lna1;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    new-instance v1, Lk;

    .line 71
    .line 72
    const/16 v6, 0xb

    .line 73
    .line 74
    invoke-direct {v1, p1, v4, v6}, Lk;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 75
    .line 76
    .line 77
    iput-object p1, v0, Lvb2;->f0:Lux0;

    .line 78
    .line 79
    iput v3, v0, Lvb2;->i0:I

    .line 80
    .line 81
    invoke-static {p0, v1, v0}, Lwl7;->x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, v5, :cond_4

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_4
    move-object p0, p1

    .line 89
    :goto_1
    iput-object v4, v0, Lvb2;->f0:Lux0;

    .line 90
    .line 91
    iput v2, v0, Lvb2;->i0:I

    .line 92
    .line 93
    invoke-virtual {p0, v0}, Lrm3;->h(Lq51;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-ne p0, v5, :cond_5

    .line 98
    .line 99
    :goto_2
    return-object v5

    .line 100
    :cond_5
    return-object p0
.end method

.method public final c(Ls51;)Ljava/lang/Object;
    .locals 13

    .line 1
    instance-of v0, p1, Lwb2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lwb2;

    .line 7
    .line 8
    iget v1, v0, Lwb2;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lwb2;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lwb2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lwb2;-><init>(Lqc2;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lwb2;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lwb2;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 49
    .line 50
    .line 51
    move-result-wide v3

    .line 52
    const-wide/16 v5, 0x3e8

    .line 53
    .line 54
    div-long v9, v3, v5

    .line 55
    .line 56
    iget-object p1, p0, Lqc2;->a:Landroid/content/Context;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lqc2;->d(Landroid/content/Context;)Lna1;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    new-instance v7, Lxb2;

    .line 63
    .line 64
    const/4 v11, 0x0

    .line 65
    const/4 v12, 0x0

    .line 66
    move-object v8, p0

    .line 67
    invoke-direct/range {v7 .. v12}, Lxb2;-><init>(Lqc2;JLq51;B)V

    .line 68
    .line 69
    .line 70
    iput v2, v0, Lwb2;->h0:I

    .line 71
    .line 72
    invoke-static {p1, v7, v0}, Lwl7;->x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    sget-object p1, Lc71;->X:Lc71;

    .line 77
    .line 78
    if-ne p0, p1, :cond_3

    .line 79
    .line 80
    return-object p1

    .line 81
    :cond_3
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 82
    .line 83
    return-object p0
.end method

.method public final d(Landroid/content/Context;)Lna1;
    .locals 2

    .line 1
    sget-object v0, Lqc2;->l:[Lnw3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object p0, p0, Lqc2;->f:Lis5;

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Lis5;->a(Lnw3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Lna1;

    .line 13
    .line 14
    return-object p0
.end method

.method public final e(Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    instance-of v2, v1, Lyb2;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lyb2;

    .line 11
    .line 12
    iget v3, v2, Lyb2;->o0:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lyb2;->o0:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lyb2;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, Lyb2;-><init>(Lqc2;Ls51;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, Lyb2;->m0:Ljava/lang/Object;

    .line 30
    .line 31
    iget v3, v2, Lyb2;->o0:I

    .line 32
    .line 33
    const/4 v4, 0x1

    .line 34
    const/4 v5, 0x0

    .line 35
    sget-object v6, Lc71;->X:Lc71;

    .line 36
    .line 37
    packed-switch v3, :pswitch_data_0

    .line 38
    .line 39
    .line 40
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return-object v5

    .line 46
    :pswitch_0
    iget-boolean v4, v2, Lyb2;->l0:Z

    .line 47
    .line 48
    iget-object v0, v2, Lyb2;->i0:Ljava/util/Set;

    .line 49
    .line 50
    check-cast v0, Ljava/util/Set;

    .line 51
    .line 52
    iget-object v0, v2, Lyb2;->h0:Ljava/util/Set;

    .line 53
    .line 54
    check-cast v0, Ljava/util/Set;

    .line 55
    .line 56
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_b

    .line 60
    .line 61
    :pswitch_1
    iget-boolean v3, v2, Lyb2;->l0:Z

    .line 62
    .line 63
    iget-wide v7, v2, Lyb2;->k0:J

    .line 64
    .line 65
    iget-wide v9, v2, Lyb2;->j0:J

    .line 66
    .line 67
    iget-object v11, v2, Lyb2;->i0:Ljava/util/Set;

    .line 68
    .line 69
    check-cast v11, Ljava/util/Set;

    .line 70
    .line 71
    iget-object v11, v2, Lyb2;->h0:Ljava/util/Set;

    .line 72
    .line 73
    check-cast v11, Ljava/util/Set;

    .line 74
    .line 75
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    goto/16 :goto_9

    .line 79
    .line 80
    :pswitch_2
    iget-boolean v3, v2, Lyb2;->l0:Z

    .line 81
    .line 82
    iget-wide v7, v2, Lyb2;->k0:J

    .line 83
    .line 84
    iget-wide v9, v2, Lyb2;->j0:J

    .line 85
    .line 86
    iget-object v11, v2, Lyb2;->i0:Ljava/util/Set;

    .line 87
    .line 88
    check-cast v11, Ljava/util/Set;

    .line 89
    .line 90
    iget-object v12, v2, Lyb2;->h0:Ljava/util/Set;

    .line 91
    .line 92
    check-cast v12, Ljava/util/Set;

    .line 93
    .line 94
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    goto/16 :goto_8

    .line 98
    .line 99
    :pswitch_3
    iget-object v3, v2, Lyb2;->h0:Ljava/util/Set;

    .line 100
    .line 101
    check-cast v3, Ljava/util/Set;

    .line 102
    .line 103
    iget-object v7, v2, Lyb2;->g0:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v8, v2, Lyb2;->f0:Ljava/lang/String;

    .line 106
    .line 107
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    move-object v12, v3

    .line 111
    goto :goto_4

    .line 112
    :pswitch_4
    iget-object v3, v2, Lyb2;->g0:Ljava/lang/String;

    .line 113
    .line 114
    iget-object v7, v2, Lyb2;->f0:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    move-object v8, v7

    .line 120
    :goto_1
    move-object v7, v3

    .line 121
    goto :goto_3

    .line 122
    :pswitch_5
    iget-object v3, v2, Lyb2;->f0:Ljava/lang/String;

    .line 123
    .line 124
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 125
    .line 126
    .line 127
    move-object/from16 v17, v3

    .line 128
    .line 129
    move-object v3, v1

    .line 130
    move-object/from16 v1, v17

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :pswitch_6
    invoke-static {v1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    move-object/from16 v1, p1

    .line 137
    .line 138
    iput-object v1, v2, Lyb2;->f0:Ljava/lang/String;

    .line 139
    .line 140
    iput v4, v2, Lyb2;->o0:I

    .line 141
    .line 142
    iget-object v3, v0, Lqc2;->i:Lxe2;

    .line 143
    .line 144
    invoke-static {v3, v2}, Lgv3;->q(Lxe2;Ls51;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    if-ne v3, v6, :cond_1

    .line 149
    .line 150
    goto/16 :goto_a

    .line 151
    .line 152
    :cond_1
    :goto_2
    check-cast v3, Ljava/lang/String;

    .line 153
    .line 154
    iput-object v1, v2, Lyb2;->f0:Ljava/lang/String;

    .line 155
    .line 156
    iput-object v3, v2, Lyb2;->g0:Ljava/lang/String;

    .line 157
    .line 158
    const/4 v7, 0x2

    .line 159
    iput v7, v2, Lyb2;->o0:I

    .line 160
    .line 161
    iget-object v7, v0, Lqc2;->j:Lxe2;

    .line 162
    .line 163
    invoke-static {v7, v2}, Lgv3;->q(Lxe2;Ls51;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v7

    .line 167
    if-ne v7, v6, :cond_2

    .line 168
    .line 169
    goto/16 :goto_a

    .line 170
    .line 171
    :cond_2
    move-object v8, v1

    .line 172
    move-object v1, v7

    .line 173
    goto :goto_1

    .line 174
    :goto_3
    check-cast v1, Ljava/util/Set;

    .line 175
    .line 176
    if-nez v1, :cond_3

    .line 177
    .line 178
    sget-object v1, Lm02;->X:Lm02;

    .line 179
    .line 180
    :cond_3
    iput-object v8, v2, Lyb2;->f0:Ljava/lang/String;

    .line 181
    .line 182
    iput-object v7, v2, Lyb2;->g0:Ljava/lang/String;

    .line 183
    .line 184
    move-object v3, v1

    .line 185
    check-cast v3, Ljava/util/Set;

    .line 186
    .line 187
    iput-object v3, v2, Lyb2;->h0:Ljava/util/Set;

    .line 188
    .line 189
    const/4 v3, 0x3

    .line 190
    iput v3, v2, Lyb2;->o0:I

    .line 191
    .line 192
    iget-object v3, v0, Lqc2;->k:Lxe2;

    .line 193
    .line 194
    invoke-static {v3, v2}, Lgv3;->q(Lxe2;Ls51;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    if-ne v3, v6, :cond_4

    .line 199
    .line 200
    goto/16 :goto_a

    .line 201
    .line 202
    :cond_4
    move-object v12, v1

    .line 203
    move-object v1, v3

    .line 204
    :goto_4
    check-cast v1, Ljava/lang/Long;

    .line 205
    .line 206
    if-eqz v1, :cond_5

    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 209
    .line 210
    .line 211
    move-result-wide v9

    .line 212
    goto :goto_5

    .line 213
    :cond_5
    const-wide/16 v9, 0x0

    .line 214
    .line 215
    :goto_5
    sget-object v1, Lkw4;->a:Lkw4;

    .line 216
    .line 217
    invoke-static {}, Lkw4;->t()Ljava/util/ArrayList;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    new-instance v3, Ljava/util/ArrayList;

    .line 222
    .line 223
    const/16 v11, 0xa

    .line 224
    .line 225
    invoke-static {v1, v11}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 226
    .line 227
    .line 228
    move-result v11

    .line 229
    invoke-direct {v3, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v11

    .line 240
    if-eqz v11, :cond_6

    .line 241
    .line 242
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v11

    .line 246
    check-cast v11, Lsu/happ/proxyutility/dto/ProviderId;

    .line 247
    .line 248
    invoke-virtual {v11}, Lsu/happ/proxyutility/dto/ProviderId;->d()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v11

    .line 252
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    goto :goto_6

    .line 256
    :cond_6
    invoke-static {v3}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 257
    .line 258
    .line 259
    move-result-object v11

    .line 260
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 261
    .line 262
    .line 263
    move-result-wide v13

    .line 264
    const-wide/16 v15, 0x3e8

    .line 265
    .line 266
    div-long/2addr v13, v15

    .line 267
    invoke-static {v7, v8}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v1

    .line 271
    if-nez v1, :cond_8

    .line 272
    .line 273
    iput-object v5, v2, Lyb2;->f0:Ljava/lang/String;

    .line 274
    .line 275
    iput-object v5, v2, Lyb2;->g0:Ljava/lang/String;

    .line 276
    .line 277
    move-object v1, v12

    .line 278
    check-cast v1, Ljava/util/Set;

    .line 279
    .line 280
    iput-object v1, v2, Lyb2;->h0:Ljava/util/Set;

    .line 281
    .line 282
    move-object v1, v11

    .line 283
    check-cast v1, Ljava/util/Set;

    .line 284
    .line 285
    iput-object v1, v2, Lyb2;->i0:Ljava/util/Set;

    .line 286
    .line 287
    iput-wide v9, v2, Lyb2;->j0:J

    .line 288
    .line 289
    iput-wide v13, v2, Lyb2;->k0:J

    .line 290
    .line 291
    iput-boolean v4, v2, Lyb2;->l0:Z

    .line 292
    .line 293
    const/4 v1, 0x4

    .line 294
    iput v1, v2, Lyb2;->o0:I

    .line 295
    .line 296
    invoke-virtual {v0, v8, v2}, Lqc2;->h(Ljava/lang/String;Ls51;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v1

    .line 300
    if-ne v1, v6, :cond_7

    .line 301
    .line 302
    goto :goto_a

    .line 303
    :cond_7
    move v3, v4

    .line 304
    goto :goto_7

    .line 305
    :cond_8
    const/4 v3, 0x0

    .line 306
    :goto_7
    move-wide v7, v13

    .line 307
    :goto_8
    move-object v1, v11

    .line 308
    check-cast v1, Ljava/util/Collection;

    .line 309
    .line 310
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-interface {v12}, Ljava/util/Set;->size()I

    .line 317
    .line 318
    .line 319
    move-result v13

    .line 320
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 321
    .line 322
    .line 323
    move-result v14

    .line 324
    if-ne v13, v14, :cond_9

    .line 325
    .line 326
    invoke-interface {v12, v1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    if-eqz v1, :cond_9

    .line 331
    .line 332
    goto :goto_9

    .line 333
    :cond_9
    iput-object v5, v2, Lyb2;->f0:Ljava/lang/String;

    .line 334
    .line 335
    iput-object v5, v2, Lyb2;->g0:Ljava/lang/String;

    .line 336
    .line 337
    iput-object v5, v2, Lyb2;->h0:Ljava/util/Set;

    .line 338
    .line 339
    iput-object v5, v2, Lyb2;->i0:Ljava/util/Set;

    .line 340
    .line 341
    iput-wide v9, v2, Lyb2;->j0:J

    .line 342
    .line 343
    iput-wide v7, v2, Lyb2;->k0:J

    .line 344
    .line 345
    iput-boolean v4, v2, Lyb2;->l0:Z

    .line 346
    .line 347
    const/4 v1, 0x5

    .line 348
    iput v1, v2, Lyb2;->o0:I

    .line 349
    .line 350
    invoke-virtual {v0, v11, v2}, Lqc2;->g(Ljava/util/Set;Ls51;)Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    if-ne v1, v6, :cond_a

    .line 355
    .line 356
    goto :goto_a

    .line 357
    :cond_a
    move v3, v4

    .line 358
    :goto_9
    sub-long v11, v7, v9

    .line 359
    .line 360
    const-wide/32 v13, 0x3f480

    .line 361
    .line 362
    .line 363
    cmp-long v1, v11, v13

    .line 364
    .line 365
    if-lez v1, :cond_c

    .line 366
    .line 367
    iput-object v5, v2, Lyb2;->f0:Ljava/lang/String;

    .line 368
    .line 369
    iput-object v5, v2, Lyb2;->g0:Ljava/lang/String;

    .line 370
    .line 371
    iput-object v5, v2, Lyb2;->h0:Ljava/util/Set;

    .line 372
    .line 373
    iput-object v5, v2, Lyb2;->i0:Ljava/util/Set;

    .line 374
    .line 375
    iput-wide v9, v2, Lyb2;->j0:J

    .line 376
    .line 377
    iput-wide v7, v2, Lyb2;->k0:J

    .line 378
    .line 379
    iput-boolean v4, v2, Lyb2;->l0:Z

    .line 380
    .line 381
    const/4 v1, 0x6

    .line 382
    iput v1, v2, Lyb2;->o0:I

    .line 383
    .line 384
    invoke-virtual {v0, v7, v8, v2}, Lqc2;->f(JLs51;)Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    if-ne v0, v6, :cond_b

    .line 389
    .line 390
    :goto_a
    return-object v6

    .line 391
    :cond_b
    :goto_b
    move v3, v4

    .line 392
    :cond_c
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    return-object v0

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final f(JLs51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p3, Llc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Llc2;

    .line 7
    .line 8
    iget v1, v0, Llc2;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Llc2;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Llc2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Llc2;-><init>(Lqc2;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Llc2;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Llc2;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_2
    invoke-static {p3}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p3, p0, Lqc2;->a:Landroid/content/Context;

    .line 49
    .line 50
    invoke-virtual {p0, p3}, Lqc2;->d(Landroid/content/Context;)Lna1;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    new-instance v3, Lxb2;

    .line 55
    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x1

    .line 58
    move-object v4, p0

    .line 59
    move-wide v5, p1

    .line 60
    invoke-direct/range {v3 .. v8}, Lxb2;-><init>(Lqc2;JLq51;B)V

    .line 61
    .line 62
    .line 63
    iput v2, v0, Llc2;->h0:I

    .line 64
    .line 65
    invoke-static {p3, v3, v0}, Lwl7;->x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    sget-object p1, Lc71;->X:Lc71;

    .line 70
    .line 71
    if-ne p0, p1, :cond_3

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_3
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 75
    .line 76
    return-object p0
.end method

.method public final g(Ljava/util/Set;Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lmc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lmc2;

    .line 7
    .line 8
    iget v1, v0, Lmc2;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lmc2;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lmc2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lmc2;-><init>(Lqc2;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lmc2;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lmc2;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p0, Lqc2;->a:Landroid/content/Context;

    .line 49
    .line 50
    invoke-virtual {p0, p2}, Lqc2;->d(Landroid/content/Context;)Lna1;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    new-instance v1, Lco;

    .line 55
    .line 56
    const/4 v4, 0x3

    .line 57
    invoke-direct {v1, p0, p1, v2, v4}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 58
    .line 59
    .line 60
    iput v3, v0, Lmc2;->h0:I

    .line 61
    .line 62
    invoke-static {p2, v1, v0}, Lwl7;->x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    sget-object p1, Lc71;->X:Lc71;

    .line 67
    .line 68
    if-ne p0, p1, :cond_3

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_3
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 72
    .line 73
    return-object p0
.end method

.method public final h(Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p2, Lnc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lnc2;

    .line 7
    .line 8
    iget v1, v0, Lnc2;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lnc2;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lnc2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lnc2;-><init>(Lqc2;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lnc2;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lnc2;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p0, Lqc2;->a:Landroid/content/Context;

    .line 49
    .line 50
    invoke-virtual {p0, p2}, Lqc2;->d(Landroid/content/Context;)Lna1;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    new-instance v1, Loc2;

    .line 55
    .line 56
    const/4 v4, 0x0

    .line 57
    invoke-direct {v1, p0, p1, v2, v4}, Loc2;-><init>(Lqc2;Ljava/lang/String;Lq51;B)V

    .line 58
    .line 59
    .line 60
    iput v3, v0, Lnc2;->h0:I

    .line 61
    .line 62
    invoke-static {p2, v1, v0}, Lwl7;->x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    sget-object p1, Lc71;->X:Lc71;

    .line 67
    .line 68
    if-ne p0, p1, :cond_3

    .line 69
    .line 70
    return-object p1

    .line 71
    :cond_3
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 72
    .line 73
    return-object p0
.end method

.method public final i(Ljava/lang/String;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, Lpc2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Lpc2;

    .line 7
    .line 8
    iget v1, v0, Lpc2;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lpc2;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lpc2;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Lpc2;-><init>(Lqc2;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Lpc2;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lpc2;->h0:I

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    if-ne v1, v3, :cond_1

    .line 34
    .line 35
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_2
    invoke-static {p2}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object p2, p0, Lqc2;->a:Landroid/content/Context;

    .line 49
    .line 50
    invoke-virtual {p0, p2}, Lqc2;->d(Landroid/content/Context;)Lna1;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    new-instance v1, Loc2;

    .line 55
    .line 56
    invoke-direct {v1, p0, p1, v2, v3}, Loc2;-><init>(Lqc2;Ljava/lang/String;Lq51;B)V

    .line 57
    .line 58
    .line 59
    iput v3, v0, Lpc2;->h0:I

    .line 60
    .line 61
    invoke-static {p2, v1, v0}, Lwl7;->x(Lna1;Lrn2;Ls51;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    sget-object p1, Lc71;->X:Lc71;

    .line 66
    .line 67
    if-ne p0, p1, :cond_3

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_3
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 71
    .line 72
    return-object p0
.end method
