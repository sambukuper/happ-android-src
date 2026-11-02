.class public abstract Lxg3;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lg34;


# instance fields
.field public final synthetic q0:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lxg3;->q0:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljx4;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public J0(Lug3;Ltr4;I)I
    .locals 0

    .line 1
    iget-byte p0, p0, Lxg3;->q0:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p3}, Ltr4;->a(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-interface {p2, p3}, Ltr4;->a(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public K(Lzr4;Ltr4;J)Lyr4;
    .locals 2

    .line 1
    invoke-virtual {p0, p2, p3, p4}, Lxg3;->Y0(Ltr4;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, Lxg3;->Z0()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-static {p3, p4, v0, v1}, Ls31;->e(JJ)J

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    :cond_0
    invoke-interface {p2, v0, v1}, Ltr4;->o(J)Leo5;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget p2, p0, Leo5;->X:I

    .line 20
    .line 21
    iget p3, p0, Leo5;->Y:I

    .line 22
    .line 23
    new-instance p4, Ld1;

    .line 24
    .line 25
    const/4 v0, 0x7

    .line 26
    invoke-direct {p4, p0, v0}, Ld1;-><init>(Leo5;B)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Le02;->X:Le02;

    .line 30
    .line 31
    invoke-interface {p1, p2, p3, p0, p4}, Lzr4;->g0(IILjava/util/Map;Lgn2;)Lyr4;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public abstract Y0(Ltr4;J)J
.end method

.method public abstract Z0()Z
.end method

.method public i0(Lug3;Ltr4;I)I
    .locals 0

    .line 1
    iget-byte p0, p0, Lxg3;->q0:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p3}, Ltr4;->m(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-interface {p2, p3}, Ltr4;->m(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public m0(Lug3;Ltr4;I)I
    .locals 0

    .line 1
    iget-byte p0, p0, Lxg3;->q0:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p3}, Ltr4;->k(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-interface {p2, p3}, Ltr4;->k(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public y0(Lug3;Ltr4;I)I
    .locals 0

    .line 1
    iget-byte p0, p0, Lxg3;->q0:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p2, p3}, Ltr4;->K(I)I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :pswitch_0
    invoke-interface {p2, p3}, Ltr4;->K(I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
