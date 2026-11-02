.class public final Lgm8;
.super Lhm8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public final b:I


# direct methods
.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lgm8;->a:B

    .line 2
    .line 3
    iput p2, p0, Lgm8;->b:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-byte v0, p0, Lgm8;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lgm8;->b:I

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    iget p0, p0, Lgm8;->b:I

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    iget p0, p0, Lgm8;->b:I

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_2
    iget p0, p0, Lgm8;->b:I

    .line 16
    .line 17
    return p0

    .line 18
    :pswitch_3
    iget p0, p0, Lgm8;->b:I

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_4
    iget p0, p0, Lgm8;->b:I

    .line 22
    .line 23
    return p0

    .line 24
    :pswitch_5
    iget p0, p0, Lgm8;->b:I

    .line 25
    .line 26
    return p0

    .line 27
    :pswitch_6
    iget p0, p0, Lgm8;->b:I

    .line 28
    .line 29
    return p0

    .line 30
    :pswitch_7
    iget p0, p0, Lgm8;->b:I

    .line 31
    .line 32
    return p0

    .line 33
    :pswitch_8
    iget p0, p0, Lgm8;->b:I

    .line 34
    .line 35
    return p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()C
    .locals 0

    .line 1
    iget-byte p0, p0, Lgm8;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 p0, 0x77

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    const/16 p0, 0x57

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    const/16 p0, 0x59

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_2
    const/16 p0, 0x63

    .line 16
    .line 17
    return p0

    .line 18
    :pswitch_3
    const/16 p0, 0x67

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_4
    const/16 p0, 0x65

    .line 22
    .line 23
    return p0

    .line 24
    :pswitch_5
    const/16 p0, 0x44

    .line 25
    .line 26
    return p0

    .line 27
    :pswitch_6
    const/16 p0, 0x46

    .line 28
    .line 29
    return p0

    .line 30
    :pswitch_7
    const/16 p0, 0x45

    .line 31
    .line 32
    return p0

    .line 33
    :pswitch_8
    const/16 p0, 0x64

    .line 34
    .line 35
    return p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lzb1;)V
    .locals 6

    .line 1
    iget-byte v0, p0, Lgm8;->a:B

    .line 2
    .line 3
    sget-object v1, Ldg5;->X:Ldg5;

    .line 4
    .line 5
    sget-object v2, Ldg5;->Y:Ldg5;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    iget v4, p0, Lgm8;->b:I

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const-string p0, "week-of-week-based-year"

    .line 15
    .line 16
    invoke-static {p0, v5}, Lvm8;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw v5

    .line 20
    :pswitch_0
    const-string p0, "week-of-month"

    .line 21
    .line 22
    invoke-static {p0, v5}, Lvm8;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v5

    .line 26
    :pswitch_1
    const-string p0, "week-based-year"

    .line 27
    .line 28
    invoke-static {p0, v5}, Lvm8;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v5

    .line 32
    :pswitch_2
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 33
    .line 34
    .line 35
    throw v5

    .line 36
    :pswitch_3
    const-string p0, "modified-julian-day"

    .line 37
    .line 38
    invoke-static {p0, v5}, Lvm8;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v5

    .line 42
    :pswitch_4
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 43
    .line 44
    .line 45
    throw v5

    .line 46
    :pswitch_5
    if-eq v4, v3, :cond_1

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    if-ne v4, v0, :cond_0

    .line 50
    .line 51
    check-cast p1, Ln3;

    .line 52
    .line 53
    new-instance p0, Lc30;

    .line 54
    .line 55
    new-instance v0, Lvc1;

    .line 56
    .line 57
    invoke-direct {v0, v2}, Lvc1;-><init>(Ldg5;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v0}, Lc30;-><init>(Lz82;)V

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, p0}, Ln3;->l(Lqj2;)V

    .line 64
    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-static {p0}, Lvm8;->e(Lqm8;)V

    .line 68
    .line 69
    .line 70
    throw v5

    .line 71
    :cond_1
    check-cast p1, Ln3;

    .line 72
    .line 73
    new-instance p0, Lc30;

    .line 74
    .line 75
    new-instance v0, Lvc1;

    .line 76
    .line 77
    invoke-direct {v0, v1}, Lvc1;-><init>(Ldg5;)V

    .line 78
    .line 79
    .line 80
    invoke-direct {p0, v0}, Lc30;-><init>(Lz82;)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, p0}, Ln3;->l(Lqj2;)V

    .line 84
    .line 85
    .line 86
    :goto_0
    return-void

    .line 87
    :pswitch_6
    const-string p0, "day-of-week-in-month"

    .line 88
    .line 89
    invoke-static {p0, v5}, Lvm8;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v5

    .line 93
    :pswitch_7
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 94
    .line 95
    .line 96
    throw v5

    .line 97
    :pswitch_8
    if-eq v4, v3, :cond_3

    .line 98
    .line 99
    const/4 v0, 0x2

    .line 100
    if-ne v4, v0, :cond_2

    .line 101
    .line 102
    invoke-interface {p1, v2}, Lzb1;->g(Ldg5;)V

    .line 103
    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_2
    invoke-static {p0}, Lvm8;->e(Lqm8;)V

    .line 107
    .line 108
    .line 109
    throw v5

    .line 110
    :cond_3
    invoke-interface {p1, v1}, Lzb1;->g(Ldg5;)V

    .line 111
    .line 112
    .line 113
    :goto_1
    return-void

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
