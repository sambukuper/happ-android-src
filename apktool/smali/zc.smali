.class public final synthetic Lzc;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lv30;

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:J


# direct methods
.method public synthetic constructor <init>(Lv30;Lkx4;JI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzc;->X:Lv30;

    .line 5
    .line 6
    iput-object p2, p0, Lzc;->Y:Lkx4;

    .line 7
    .line 8
    iput-wide p3, p0, Lzc;->Z:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/16 p1, 0x181

    .line 10
    .line 11
    invoke-static {p1}, Lw79;->P(I)I

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    iget-object v0, p0, Lzc;->X:Lv30;

    .line 16
    .line 17
    iget-object v1, p0, Lzc;->Y:Lkx4;

    .line 18
    .line 19
    iget-wide v2, p0, Lzc;->Z:J

    .line 20
    .line 21
    invoke-static/range {v0 .. v5}, Ldd;->a(Lv30;Lkx4;JLlp2;I)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Ldn8;->a:Ldn8;

    .line 25
    .line 26
    return-object p0
.end method
