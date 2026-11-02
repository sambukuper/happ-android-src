.class public final synthetic Lu11;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ldq;

.field public final synthetic Z:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ldq;Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lu11;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lu11;->Y:Ldq;

    .line 4
    .line 5
    iput-object p2, p0, Lu11;->Z:Ljava/lang/String;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lu11;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lu11;->Z:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p0, p0, Lu11;->Y:Ldq;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ldq;->o(Ljava/lang/String;)Lqr6;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-virtual {p0, v1}, Ldq;->o(Ljava/lang/String;)Lqr6;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string v0, "PRAGMA query_only = 1"

    .line 20
    .line 21
    invoke-static {p0, v0}, Lnr4;->r(Lqr6;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
