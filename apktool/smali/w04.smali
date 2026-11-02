.class public final Lw04;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Ly04;


# direct methods
.method public synthetic constructor <init>(Ly04;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lw04;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lw04;->Y:Ly04;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lw04;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lw04;->Y:Ly04;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lw51;->x(Lnb6;)Ljava/lang/reflect/Type;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lp04;->r()Lwd0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-interface {p0}, Lwd0;->j()Ljava/lang/reflect/Type;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    return-object v0

    .line 23
    :pswitch_0
    iget-object p0, p0, Ly04;->k0:Liz3;

    .line 24
    .line 25
    iget-object v0, p0, Liz3;->d:Lmz3;

    .line 26
    .line 27
    sget-object v1, Low;->o:Ldq;

    .line 28
    .line 29
    sget-object v2, Low;->a:[Lnw3;

    .line 30
    .line 31
    const/16 v3, 0x21

    .line 32
    .line 33
    aget-object v2, v2, v3

    .line 34
    .line 35
    invoke-virtual {v1, v2, p0}, Ldq;->x(Lnw3;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    if-nez p0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    const/4 v0, 0x0

    .line 43
    :goto_0
    return-object v0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
