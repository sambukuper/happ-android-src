.class public final Lql1;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lsl1;


# direct methods
.method public synthetic constructor <init>(Lsl1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lql1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lql1;->Y:Lsl1;

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
    .locals 2

    .line 1
    iget-byte v0, p0, Lql1;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lql1;->Y:Lsl1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lsl1;->g:Lz14;

    .line 9
    .line 10
    iget-object p0, p0, Lsl1;->j:Lvl1;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lvl1;->l()Llh8;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Li3;

    .line 23
    .line 24
    invoke-virtual {p0}, Li3;->c()Ljava/util/Collection;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_0
    sget-object v0, Lpk1;->m:Lpk1;

    .line 33
    .line 34
    sget-object v1, Let4;->a:Llh4;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v1, Lcl1;->F0:Lcl1;

    .line 40
    .line 41
    invoke-virtual {p0, v0, v1}, Lgm1;->i(Lpk1;Lgn2;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0

    .line 46
    nop

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
