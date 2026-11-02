.class public final synthetic Lhw6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:Lzy0;

.field public final synthetic Z:Lrn2;

.field public final synthetic f0:Lrn2;

.field public final synthetic g0:Lrn2;

.field public final synthetic h0:B

.field public final synthetic i0:J

.field public final synthetic j0:J

.field public final synthetic k0:Lv09;

.field public final synthetic l0:Lzy0;


# direct methods
.method public synthetic constructor <init>(Lkx4;Lzy0;Lrn2;Lrn2;Lrn2;IJJLv09;Lzy0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhw6;->X:Lkx4;

    .line 5
    .line 6
    iput-object p2, p0, Lhw6;->Y:Lzy0;

    .line 7
    .line 8
    iput-object p3, p0, Lhw6;->Z:Lrn2;

    .line 9
    .line 10
    iput-object p4, p0, Lhw6;->f0:Lrn2;

    .line 11
    .line 12
    iput-object p5, p0, Lhw6;->g0:Lrn2;

    .line 13
    .line 14
    iput-byte p6, p0, Lhw6;->h0:B

    .line 15
    .line 16
    iput-wide p7, p0, Lhw6;->i0:J

    .line 17
    .line 18
    iput-wide p9, p0, Lhw6;->j0:J

    .line 19
    .line 20
    iput-object p11, p0, Lhw6;->k0:Lv09;

    .line 21
    .line 22
    iput-object p12, p0, Lhw6;->l0:Lzy0;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v12, p1

    .line 2
    check-cast v12, Llp2;

    .line 3
    .line 4
    move-object/from16 v0, p2

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-static {v0}, Lw79;->P(I)I

    .line 13
    .line 14
    .line 15
    move-result v13

    .line 16
    iget-object v0, p0, Lhw6;->X:Lkx4;

    .line 17
    .line 18
    iget-object v1, p0, Lhw6;->Y:Lzy0;

    .line 19
    .line 20
    iget-object v2, p0, Lhw6;->Z:Lrn2;

    .line 21
    .line 22
    iget-object v3, p0, Lhw6;->f0:Lrn2;

    .line 23
    .line 24
    iget-object v4, p0, Lhw6;->g0:Lrn2;

    .line 25
    .line 26
    iget-byte v5, p0, Lhw6;->h0:B

    .line 27
    .line 28
    iget-wide v6, p0, Lhw6;->i0:J

    .line 29
    .line 30
    iget-wide v8, p0, Lhw6;->j0:J

    .line 31
    .line 32
    iget-object v10, p0, Lhw6;->k0:Lv09;

    .line 33
    .line 34
    iget-object v11, p0, Lhw6;->l0:Lzy0;

    .line 35
    .line 36
    invoke-static/range {v0 .. v13}, Lwl7;->i(Lkx4;Lzy0;Lrn2;Lrn2;Lrn2;IJJLv09;Lzy0;Llp2;I)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Ldn8;->a:Ldn8;

    .line 40
    .line 41
    return-object p0
.end method
