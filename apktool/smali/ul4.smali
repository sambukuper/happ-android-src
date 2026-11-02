.class public final synthetic Lul4;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lea6;


# direct methods
.method public synthetic constructor <init>(Lea6;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lul4;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lul4;->Y:Lea6;

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
    iget-byte v0, p0, Lul4;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lul4;->Y:Lea6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lokhttp3/internal/ws/RealWebSocket;->c(Lea6;)Ldn8;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lea6;->X:Ljava/lang/Object;

    .line 15
    .line 16
    sget-object p0, Ldn8;->a:Ldn8;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
