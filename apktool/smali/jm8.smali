.class public final Ljm8;
.super Lnm8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public final b:I


# direct methods
.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 1
    iput-byte p1, p0, Ljm8;->a:B

    .line 2
    .line 3
    iput p2, p0, Ljm8;->b:I

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
    iget-byte v0, p0, Ljm8;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Ljm8;->b:I

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    iget p0, p0, Ljm8;->b:I

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    iget p0, p0, Ljm8;->b:I

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_2
    iget p0, p0, Ljm8;->b:I

    .line 16
    .line 17
    return p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()C
    .locals 0

    .line 1
    iget-byte p0, p0, Ljm8;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 p0, 0x6d

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    const/16 p0, 0x48

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    const/16 p0, 0x61

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_2
    const/16 p0, 0x68

    .line 16
    .line 17
    return p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Lac1;)V
    .locals 7

    .line 1
    iget-byte v0, p0, Ljm8;->a:B

    .line 2
    .line 3
    sget-object v1, Ldg5;->X:Ldg5;

    .line 4
    .line 5
    sget-object v2, Ldg5;->Y:Ldg5;

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x1

    .line 9
    iget v5, p0, Ljm8;->b:I

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    if-eq v5, v4, :cond_1

    .line 16
    .line 17
    if-ne v5, v3, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, v2}, Lac1;->f(Ldg5;)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {p0}, Lvm8;->e(Lqm8;)V

    .line 24
    .line 25
    .line 26
    throw v6

    .line 27
    :cond_1
    invoke-interface {p1, v1}, Lac1;->f(Ldg5;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :pswitch_0
    if-eq v5, v4, :cond_3

    .line 32
    .line 33
    if-ne v5, v3, :cond_2

    .line 34
    .line 35
    invoke-interface {p1, v2}, Lac1;->b(Ldg5;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-static {p0}, Lvm8;->e(Lqm8;)V

    .line 40
    .line 41
    .line 42
    throw v6

    .line 43
    :cond_3
    invoke-interface {p1, v1}, Lac1;->b(Ldg5;)V

    .line 44
    .line 45
    .line 46
    :goto_1
    return-void

    .line 47
    :pswitch_1
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 48
    .line 49
    .line 50
    throw v6

    .line 51
    :pswitch_2
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 52
    .line 53
    .line 54
    throw v6

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
