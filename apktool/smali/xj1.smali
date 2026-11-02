.class public final Lxj1;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lzj1;


# direct methods
.method public synthetic constructor <init>(Lzj1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lxj1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lxj1;->Y:Lzj1;

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
    iget-byte v0, p0, Lxj1;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lxj1;->Y:Lzj1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lgk1;->W()Ljava/lang/reflect/Member;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p0, v0}, Lz51;->A(Lpb6;Ljava/lang/reflect/Member;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    new-instance v0, Lyj1;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lyj1;-><init>(Lzj1;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
