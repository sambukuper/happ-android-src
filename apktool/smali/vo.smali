.class public final synthetic Lvo;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lzy0;

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:Lzy0;

.field public final synthetic f0:Lsn2;

.field public final synthetic g0:F

.field public final synthetic h0:Lv09;

.field public final synthetic i0:Lkc8;

.field public final synthetic j0:I


# direct methods
.method public synthetic constructor <init>(Lzy0;Lkx4;Lzy0;Lsn2;FLv09;Lkc8;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvo;->X:Lzy0;

    .line 5
    .line 6
    iput-object p2, p0, Lvo;->Y:Lkx4;

    .line 7
    .line 8
    iput-object p3, p0, Lvo;->Z:Lzy0;

    .line 9
    .line 10
    iput-object p4, p0, Lvo;->f0:Lsn2;

    .line 11
    .line 12
    iput p5, p0, Lvo;->g0:F

    .line 13
    .line 14
    iput-object p6, p0, Lvo;->h0:Lv09;

    .line 15
    .line 16
    iput-object p7, p0, Lvo;->i0:Lkc8;

    .line 17
    .line 18
    iput p8, p0, Lvo;->j0:I

    .line 19
    .line 20
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
    iget p1, p0, Lvo;->j0:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, Lvo;->X:Lzy0;

    .line 18
    .line 19
    iget-object v1, p0, Lvo;->Y:Lkx4;

    .line 20
    .line 21
    iget-object v2, p0, Lvo;->Z:Lzy0;

    .line 22
    .line 23
    iget-object v3, p0, Lvo;->f0:Lsn2;

    .line 24
    .line 25
    iget v4, p0, Lvo;->g0:F

    .line 26
    .line 27
    iget-object v5, p0, Lvo;->h0:Lv09;

    .line 28
    .line 29
    iget-object v6, p0, Lvo;->i0:Lkc8;

    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, Lzo;->b(Lzy0;Lkx4;Lzy0;Lsn2;FLv09;Lkc8;Llp2;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Ldn8;->a:Ldn8;

    .line 35
    .line 36
    return-object p0
.end method
