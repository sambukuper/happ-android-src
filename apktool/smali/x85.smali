.class public final Lx85;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lnf5;


# static fields
.field public static final Y:Ldx4;


# instance fields
.field public final X:Lw85;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldx4;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    invoke-direct {v0, v1}, Ldx4;-><init>(B)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lx85;->Y:Ldx4;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lw85;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx85;->X:Lw85;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final t()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lx85;->X:Lw85;

    .line 2
    .line 3
    check-cast p0, Ljx4;

    .line 4
    .line 5
    iget-object p0, p0, Ljx4;->X:Ljx4;

    .line 6
    .line 7
    iget-boolean p0, p0, Ljx4;->p0:Z

    .line 8
    .line 9
    return p0
.end method
