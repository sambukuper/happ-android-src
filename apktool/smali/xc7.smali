.class public final Lxc7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lhe2;


# instance fields
.field public final a:Llr;

.field public final b:Lpk;

.field public final c:Lgp1;


# direct methods
.method public constructor <init>(Llr;Lpk;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxc7;->a:Llr;

    .line 5
    .line 6
    iput-object p2, p0, Lxc7;->b:Lpk;

    .line 7
    .line 8
    sget-object p1, Liy6;->b:Lgp1;

    .line 9
    .line 10
    iput-object p1, p0, Lxc7;->c:Lgp1;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Lxx6;FLuy7;)Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, Lw39;->h0:Lzx6;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, v0, p3}, Lxc7;->c(Lxx6;FLzx6;Ls51;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final b(Lxx6;FLgn2;Ls51;)Ljava/lang/Object;
    .locals 9

    .line 1
    instance-of v0, p4, Lsc7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lsc7;

    .line 7
    .line 8
    iget v1, v0, Lsc7;->i0:I

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
    iput v1, v0, Lsc7;->i0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lsc7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lsc7;-><init>(Lxc7;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lsc7;->g0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lsc7;->i0:I

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
    iget-object p3, v0, Lsc7;->f0:Lgn2;

    .line 35
    .line 36
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v3, Luc7;

    .line 51
    .line 52
    const/4 v8, 0x0

    .line 53
    move-object v4, p0

    .line 54
    move-object v7, p1

    .line 55
    move v5, p2

    .line 56
    move-object v6, p3

    .line 57
    invoke-direct/range {v3 .. v8}, Luc7;-><init>(Lxc7;FLgn2;Lxx6;Lq51;)V

    .line 58
    .line 59
    .line 60
    iput-object v6, v0, Lsc7;->f0:Lgn2;

    .line 61
    .line 62
    iput v2, v0, Lsc7;->i0:I

    .line 63
    .line 64
    iget-object p0, v4, Lxc7;->c:Lgp1;

    .line 65
    .line 66
    invoke-static {p0, v3, v0}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p4

    .line 70
    sget-object p0, Lc71;->X:Lc71;

    .line 71
    .line 72
    if-ne p4, p0, :cond_3

    .line 73
    .line 74
    return-object p0

    .line 75
    :cond_3
    move-object p3, v6

    .line 76
    :goto_1
    check-cast p4, Lmk;

    .line 77
    .line 78
    new-instance p0, Ljava/lang/Float;

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    invoke-direct {p0, p1}, Ljava/lang/Float;-><init>(F)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p3, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    return-object p4
.end method

.method public final c(Lxx6;FLzx6;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Lvc7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lvc7;

    .line 7
    .line 8
    iget v1, v0, Lvc7;->h0:I

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
    iput v1, v0, Lvc7;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lvc7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lvc7;-><init>(Lxc7;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p4, v0, Lvc7;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Lvc7;->h0:I

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
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

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
    invoke-static {p4}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iput v2, v0, Lvc7;->h0:I

    .line 49
    .line 50
    invoke-virtual {p0, p1, p2, p3, v0}, Lxc7;->b(Lxx6;FLgn2;Ls51;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p4

    .line 54
    sget-object p0, Lc71;->X:Lc71;

    .line 55
    .line 56
    if-ne p4, p0, :cond_3

    .line 57
    .line 58
    return-object p0

    .line 59
    :cond_3
    :goto_1
    check-cast p4, Lmk;

    .line 60
    .line 61
    iget-object p0, p4, Lmk;->a:Ljava/lang/Float;

    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    iget-object p1, p4, Lmk;->b:Lqk;

    .line 68
    .line 69
    const/4 p2, 0x0

    .line 70
    cmpg-float p0, p0, p2

    .line 71
    .line 72
    if-nez p0, :cond_4

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_4
    invoke-virtual {p1}, Lqk;->a()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    :goto_2
    new-instance p0, Ljava/lang/Float;

    .line 86
    .line 87
    invoke-direct {p0, p2}, Ljava/lang/Float;-><init>(F)V

    .line 88
    .line 89
    .line 90
    return-object p0
.end method

.method public final d(Lxx6;FFLtc7;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p5, Lwc7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, Lwc7;

    .line 7
    .line 8
    iget v1, v0, Lwc7;->h0:I

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
    iput v1, v0, Lwc7;->h0:I

    .line 18
    .line 19
    :goto_0
    move-object p5, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, Lwc7;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, Lwc7;-><init>(Lxc7;Ls51;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p5, Lwc7;->f0:Ljava/lang/Object;

    .line 28
    .line 29
    iget v1, p5, Lwc7;->h0:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_5

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    const/4 v1, 0x0

    .line 55
    cmpg-float v0, v0, v1

    .line 56
    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    cmpg-float v0, v0, v1

    .line 65
    .line 66
    if-nez v0, :cond_4

    .line 67
    .line 68
    :goto_2
    const/16 p0, 0x1c

    .line 69
    .line 70
    invoke-static {p2, p3, p0}, Lz68;->b(FFI)Lqk;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :cond_4
    iput v2, p5, Lwc7;->h0:I

    .line 76
    .line 77
    sget-object v0, Lt9;->b:Lbd1;

    .line 78
    .line 79
    invoke-static {v0, v1, p3}, Lz39;->k(Lbd1;FF)F

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    cmpl-float v0, v0, v1

    .line 92
    .line 93
    if-ltz v0, :cond_5

    .line 94
    .line 95
    new-instance p0, Lra;

    .line 96
    .line 97
    const/16 v0, 0x14

    .line 98
    .line 99
    const/4 v1, 0x0

    .line 100
    invoke-direct {p0, v0, v1}, Lra;-><init>(BZ)V

    .line 101
    .line 102
    .line 103
    :goto_3
    move v0, p2

    .line 104
    goto :goto_4

    .line 105
    :cond_5
    new-instance v0, Llr5;

    .line 106
    .line 107
    iget-object p0, p0, Lxc7;->b:Lpk;

    .line 108
    .line 109
    const/16 v1, 0x15

    .line 110
    .line 111
    invoke-direct {v0, p0, v1}, Llr5;-><init>(Ljava/lang/Object;B)V

    .line 112
    .line 113
    .line 114
    move-object p0, v0

    .line 115
    goto :goto_3

    .line 116
    :goto_4
    new-instance p2, Ljava/lang/Float;

    .line 117
    .line 118
    invoke-direct {p2, v0}, Ljava/lang/Float;-><init>(F)V

    .line 119
    .line 120
    .line 121
    move v0, p3

    .line 122
    new-instance p3, Ljava/lang/Float;

    .line 123
    .line 124
    invoke-direct {p3, v0}, Ljava/lang/Float;-><init>(F)V

    .line 125
    .line 126
    .line 127
    invoke-interface/range {p0 .. p5}, Lvs;->h(Lxx6;Ljava/lang/Float;Ljava/lang/Float;Lgn2;Lwc7;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sget-object p0, Lc71;->X:Lc71;

    .line 132
    .line 133
    if-ne v0, p0, :cond_6

    .line 134
    .line 135
    return-object p0

    .line 136
    :cond_6
    :goto_5
    check-cast v0, Lmk;

    .line 137
    .line 138
    iget-object p0, v0, Lmk;->b:Lqk;

    .line 139
    .line 140
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lxc7;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p1, Lxc7;

    .line 7
    .line 8
    iget-object v0, p1, Lxc7;->b:Lpk;

    .line 9
    .line 10
    iget-object v2, p0, Lxc7;->b:Lpk;

    .line 11
    .line 12
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object p1, p1, Lxc7;->a:Llr;

    .line 19
    .line 20
    iget-object p0, p0, Lxc7;->a:Llr;

    .line 21
    .line 22
    if-eq p1, p0, :cond_0

    .line 23
    .line 24
    return v1

    .line 25
    :cond_0
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lxc7;->b:Lpk;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    sget-object v1, Lt9;->b:Lbd1;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v1, v0

    .line 16
    mul-int/lit8 v1, v1, 0x1f

    .line 17
    .line 18
    iget-object p0, p0, Lxc7;->a:Llr;

    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    add-int/2addr p0, v1

    .line 25
    return p0
.end method
