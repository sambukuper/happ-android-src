.class public final Lv30;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lr68;


# direct methods
.method public synthetic constructor <init>(Lr68;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lv30;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lv30;->b:Lr68;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()J
    .locals 2

    .line 1
    iget-byte v0, p0, Lv30;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Lv30;->b:Lr68;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p0, v0, v1}, Lr68;->p(ZZ)Lf58;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-wide v0, p0, Lf58;->b:J

    .line 15
    .line 16
    return-wide v0

    .line 17
    :pswitch_0
    invoke-virtual {p0, v1, v1}, Lr68;->p(ZZ)Lf58;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    iget-wide v0, p0, Lf58;->b:J

    .line 22
    .line 23
    return-wide v0

    .line 24
    :pswitch_1
    invoke-virtual {p0, v1}, Lr68;->j(Z)Lf58;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    iget-wide v0, p0, Lf58;->b:J

    .line 29
    .line 30
    return-wide v0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
