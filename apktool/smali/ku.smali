.class public Lku;
.super Lsi8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final d:Lku;


# instance fields
.field public final synthetic c:B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lku;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v1, v2}, Lku;-><init>(Lvh8;Ld50;B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lku;->d:Lku;

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lvh8;Ld50;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lku;->c:B

    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lsi8;-><init>(Lvh8;Ld50;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ld50;)Lri8;
    .locals 2

    .line 1
    iget-byte v0, p0, Lku;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsi8;->b:Ld50;

    .line 7
    .line 8
    if-ne v0, p1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    new-instance v0, Lku;

    .line 12
    .line 13
    iget-object p0, p0, Lsi8;->a:Lvh8;

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    invoke-direct {v0, p0, p1, v1}, Lku;-><init>(Lvh8;Ld50;B)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, Lku;->g(Ld50;)Lku;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    :pswitch_1
    return-object p0

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c()Ltr3;
    .locals 0

    .line 1
    iget-byte p0, p0, Lku;->c:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p0, Ltr3;->Y:Ltr3;

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    sget-object p0, Ltr3;->Z:Ltr3;

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    sget-object p0, Ltr3;->g0:Ltr3;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public e(Lro3;Lz76;)Lz76;
    .locals 1

    .line 1
    iget-byte v0, p0, Lku;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lsi8;->e(Lro3;Lz76;)Lz76;

    .line 7
    .line 8
    .line 9
    return-object p2

    .line 10
    :pswitch_0
    iget-object p0, p2, Lz76;->i0:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lgr3;

    .line 13
    .line 14
    iget-boolean p0, p0, Lgr3;->Z:Z

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lro3;->e1(Lz76;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 p2, 0x0

    .line 26
    :goto_0
    return-object p2

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public f(Lro3;Lz76;)Lz76;
    .locals 1

    .line 1
    iget-byte v0, p0, Lku;->c:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lri8;->f(Lro3;Lz76;)Lz76;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    if-nez p2, :cond_0

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {p1, p2}, Lro3;->f1(Lz76;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    return-object p2

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g(Ld50;)Lku;
    .locals 2

    .line 1
    iget-object v0, p0, Lsi8;->b:Ld50;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lku;

    .line 7
    .line 8
    iget-object p0, p0, Lsi8;->a:Lvh8;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p1, v1}, Lku;-><init>(Lvh8;Ld50;B)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
