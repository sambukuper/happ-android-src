.class public final synthetic Lk40;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lb71;

.field public final synthetic Z:Ljc8;


# direct methods
.method public synthetic constructor <init>(Lb71;Ljc8;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lk40;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lk40;->Y:Lb71;

    .line 4
    .line 5
    iput-object p2, p0, Lk40;->Z:Ljc8;

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
    .locals 5

    .line 1
    iget-byte v0, p0, Lk40;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lk40;->Z:Ljc8;

    .line 5
    .line 6
    iget-object p0, p0, Lk40;->Y:Lb71;

    .line 7
    .line 8
    const/4 v3, 0x3

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v0, Lo40;

    .line 13
    .line 14
    invoke-direct {v0, v2, v1, v3}, Lo40;-><init>(Ljc8;Lq51;B)V

    .line 15
    .line 16
    .line 17
    invoke-static {p0, v1, v0, v3}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 18
    .line 19
    .line 20
    sget-object p0, Ldn8;->a:Ldn8;

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    new-instance v0, Lo40;

    .line 24
    .line 25
    const/4 v4, 0x0

    .line 26
    invoke-direct {v0, v2, v1, v4}, Lo40;-><init>(Ljc8;Lq51;B)V

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v1, v1, v0, v3}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 30
    .line 31
    .line 32
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
