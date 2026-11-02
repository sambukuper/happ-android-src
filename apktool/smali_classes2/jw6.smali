.class public final synthetic Ljw6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lzy0;

.field public final synthetic Z:Lzy0;

.field public final synthetic f0:Lrn2;

.field public final synthetic g0:Lrn2;

.field public final synthetic h0:Lv09;

.field public final synthetic i0:Lrn2;


# direct methods
.method public synthetic constructor <init>(ILzy0;Lzy0;Lrn2;Lrn2;Lv09;Lrn2;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-byte p1, p0, Ljw6;->X:B

    .line 5
    .line 6
    iput-object p2, p0, Ljw6;->Y:Lzy0;

    .line 7
    .line 8
    iput-object p3, p0, Ljw6;->Z:Lzy0;

    .line 9
    .line 10
    iput-object p4, p0, Ljw6;->f0:Lrn2;

    .line 11
    .line 12
    iput-object p5, p0, Ljw6;->g0:Lrn2;

    .line 13
    .line 14
    iput-object p6, p0, Ljw6;->h0:Lv09;

    .line 15
    .line 16
    iput-object p7, p0, Ljw6;->i0:Lrn2;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Lw79;->P(I)I

    .line 11
    .line 12
    .line 13
    move-result v8

    .line 14
    iget-byte v0, p0, Ljw6;->X:B

    .line 15
    .line 16
    iget-object v1, p0, Ljw6;->Y:Lzy0;

    .line 17
    .line 18
    iget-object v2, p0, Ljw6;->Z:Lzy0;

    .line 19
    .line 20
    iget-object v3, p0, Ljw6;->f0:Lrn2;

    .line 21
    .line 22
    iget-object v4, p0, Ljw6;->g0:Lrn2;

    .line 23
    .line 24
    iget-object v5, p0, Ljw6;->h0:Lv09;

    .line 25
    .line 26
    iget-object v6, p0, Ljw6;->i0:Lrn2;

    .line 27
    .line 28
    invoke-static/range {v0 .. v8}, Lwl7;->j(ILzy0;Lzy0;Lrn2;Lrn2;Lv09;Lrn2;Llp2;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Ldn8;->a:Ldn8;

    .line 32
    .line 33
    return-object p0
.end method
