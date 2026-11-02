.class public final Lmm8;
.super Llm8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public final b:I


# direct methods
.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lmm8;->a:B

    .line 2
    .line 3
    iput p2, p0, Lmm8;->b:I

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
    iget-byte v0, p0, Lmm8;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lmm8;->b:I

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    iget p0, p0, Lmm8;->b:I

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    iget p0, p0, Lmm8;->b:I

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_2
    iget p0, p0, Lmm8;->b:I

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
    iget-byte p0, p0, Lmm8;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 p0, 0x6e

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    const/16 p0, 0x4e

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    const/16 p0, 0x41

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_2
    const/16 p0, 0x53

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
    .locals 2

    .line 1
    iget-byte v0, p0, Lmm8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    const-string p0, "nano-of-second"

    .line 8
    .line 9
    const-string p1, "Maybe you meant \'S\' instead of \'n\'?"

    .line 10
    .line 11
    invoke-static {p0, p1}, Lvm8;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw v1

    .line 15
    :pswitch_0
    const-string p0, "nanosecond-of-day"

    .line 16
    .line 17
    invoke-static {p0, v1}, Lvm8;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    throw v1

    .line 21
    :pswitch_1
    const-string p0, "millisecond-of-day"

    .line 22
    .line 23
    invoke-static {p0, v1}, Lvm8;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v1

    .line 27
    :pswitch_2
    check-cast p1, Lo3;

    .line 28
    .line 29
    new-instance v0, Lc30;

    .line 30
    .line 31
    new-instance v1, Lik2;

    .line 32
    .line 33
    iget p0, p0, Lmm8;->b:I

    .line 34
    .line 35
    invoke-direct {v1, p0, p0}, Lik2;-><init>(II)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0, v1}, Lc30;-><init>(Lz82;)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p1, v0}, Lo3;->k(Lqj2;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
