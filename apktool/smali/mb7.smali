.class public final synthetic Lmb7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lpb7;

.field public final synthetic Y:Lxz4;

.field public final synthetic Z:Lkx4;

.field public final synthetic f0:Ljb7;

.field public final synthetic g0:J


# direct methods
.method public synthetic constructor <init>(Lpb7;Lxz4;Lkx4;Ljb7;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmb7;->X:Lpb7;

    .line 5
    .line 6
    iput-object p2, p0, Lmb7;->Y:Lxz4;

    .line 7
    .line 8
    iput-object p3, p0, Lmb7;->Z:Lkx4;

    .line 9
    .line 10
    iput-object p4, p0, Lmb7;->f0:Ljb7;

    .line 11
    .line 12
    iput-wide p5, p0, Lmb7;->g0:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p1, 0x30001

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lw79;->P(I)I

    .line 13
    .line 14
    .line 15
    move-result v7

    .line 16
    iget-object v0, p0, Lmb7;->X:Lpb7;

    .line 17
    .line 18
    iget-object v1, p0, Lmb7;->Y:Lxz4;

    .line 19
    .line 20
    iget-object v2, p0, Lmb7;->Z:Lkx4;

    .line 21
    .line 22
    iget-object v3, p0, Lmb7;->f0:Ljb7;

    .line 23
    .line 24
    iget-wide v4, p0, Lmb7;->g0:J

    .line 25
    .line 26
    invoke-virtual/range {v0 .. v7}, Lpb7;->a(Lxz4;Lkx4;Ljb7;JLlp2;I)V

    .line 27
    .line 28
    .line 29
    sget-object p0, Ldn8;->a:Ldn8;

    .line 30
    .line 31
    return-object p0
.end method
