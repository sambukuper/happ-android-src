.class public final Lpj7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lw80;


# instance fields
.field public final b:Ldn2;

.field public final c:Lw80;


# direct methods
.method public constructor <init>(Ldn2;Lz24;Lw80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpj7;->b:Ldn2;

    .line 5
    .line 6
    iput-object p3, p0, Lpj7;->c:Lw80;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(FFF)F
    .locals 1

    .line 1
    iget-object v0, p0, Lpj7;->b:Ldn2;

    .line 2
    .line 3
    invoke-interface {v0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    int-to-float v0, v0

    .line 14
    sub-float/2addr p1, v0

    .line 15
    iget-object p0, p0, Lpj7;->c:Lw80;

    .line 16
    .line 17
    sub-float/2addr p3, v0

    .line 18
    invoke-interface {p0, p1, p2, p3}, Lw80;->a(FFF)F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0
.end method
