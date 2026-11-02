.class public final Lal3;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lrk3;


# direct methods
.method public synthetic constructor <init>(Lrk3;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lal3;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lal3;->Y:Lrk3;

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
    .locals 1

    .line 1
    iget-byte v0, p0, Lal3;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lal3;->Y:Lrk3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {p0, v0}, Lw79;->k(Lyk3;Z)Lne0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :pswitch_0
    new-instance v0, Lrf1;

    .line 15
    .line 16
    iget-object p0, p0, Lrk3;->f0:Lsk3;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lrf1;-><init>(Lpb6;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
