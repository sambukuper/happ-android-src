.class public final Lu54;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lk50;


# instance fields
.field public final synthetic a:Lv54;

.field public final synthetic b:Lea6;

.field public final synthetic c:I


# direct methods
.method public constructor <init>(Lv54;Lea6;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu54;->a:Lv54;

    .line 5
    .line 6
    iput-object p2, p0, Lu54;->b:Lea6;

    .line 7
    .line 8
    iput p3, p0, Lu54;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu54;->b:Lea6;

    .line 2
    .line 3
    iget-object v0, v0, Lea6;->X:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lr54;

    .line 6
    .line 7
    iget v1, p0, Lu54;->c:I

    .line 8
    .line 9
    iget-object p0, p0, Lu54;->a:Lv54;

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lv54;->Y0(Lr54;I)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method
