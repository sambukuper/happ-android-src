.class public final synthetic Lf68;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lda6;

.field public final synthetic Z:Lda6;

.field public final synthetic f0:Lr68;


# direct methods
.method public synthetic constructor <init>(Lda6;Lda6;Lr68;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lf68;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lf68;->Y:Lda6;

    .line 4
    .line 5
    iput-object p2, p0, Lf68;->Z:Lda6;

    .line 6
    .line 7
    iput-object p3, p0, Lf68;->f0:Lr68;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Lda6;Lr68;Lda6;B)V
    .locals 0

    .line 13
    iput-byte p4, p0, Lf68;->X:B

    iput-object p1, p0, Lf68;->Y:Lda6;

    iput-object p2, p0, Lf68;->f0:Lr68;

    iput-object p3, p0, Lf68;->Z:Lda6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lf68;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lf68;->Z:Lda6;

    .line 6
    .line 7
    iget-object v3, p0, Lf68;->f0:Lr68;

    .line 8
    .line 9
    iget-object p0, p0, Lf68;->Y:Lda6;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v2, v3}, Lr68;->h(Lda6;Lda6;Lr68;)V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :pswitch_0
    invoke-static {p0, v2, v3}, Lr68;->f(Lda6;Lda6;Lr68;)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_1
    invoke-static {p0, v2, v3}, Lr68;->f(Lda6;Lda6;Lr68;)V

    .line 23
    .line 24
    .line 25
    return-object v1

    .line 26
    :pswitch_2
    invoke-static {p0, v2, v3}, Lr68;->h(Lda6;Lda6;Lr68;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
